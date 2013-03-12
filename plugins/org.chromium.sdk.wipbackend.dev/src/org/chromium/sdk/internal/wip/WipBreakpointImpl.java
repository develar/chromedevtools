// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.wip;

import org.chromium.sdk.*;
import org.chromium.sdk.JavascriptVm.BreakpointCallback;
import org.chromium.sdk.internal.ScriptRegExpBreakpointTarget;
import org.chromium.sdk.util.GenericCallback;
import org.chromium.sdk.util.RelaySyncCallback;
import org.chromium.wip.protocol.ProtocolReponseReader;
import org.chromium.wip.protocol.debugger.LocationValue;
import org.chromium.wip.protocol.debugger.SetBreakpointByUrlResult;
import org.chromium.wip.protocol.debugger.SetBreakpointResult;
import org.chromium.wip.protocol.debugger.Location;
import org.chromium.wip.protocol.debugger.RemoveBreakpoint;
import org.chromium.wip.protocol.debugger.SetBreakpoint;
import org.chromium.wip.protocol.debugger.SetBreakpointByUrl;
import org.jetbrains.jsonProtocol.RequestWithResponse;
import org.jetbrains.wip.protocol.CommandResponse.Success;

import java.util.*;

/**
 * Wip-based breakpoint implementation.
 * The implementation is based on volatile fields and expects client code to do some
 * synchronization (serialize calls to setters, {@link #flush} and {@link #clear}).
 */
public class WipBreakpointImpl implements Breakpoint {
  private final WipBreakpointManager breakpointManager;

  private final Target target;

  private final int lineNumber;
  private final int columnNumber;

  private final int sdkId;
  private volatile String protocolId = null;

  private volatile String condition;
  private volatile boolean enabled;
  private volatile boolean isDirty;

  // Access only from Dispatch thread.
  private Set<ActualLocation> actualLocations = new HashSet<ActualLocation>(2);

  public WipBreakpointImpl(WipBreakpointManager breakpointManager, int sdkId, Target target,
      int lineNumber, int columnNumber, String condition, boolean enabled) {
    this.breakpointManager = breakpointManager;
    this.sdkId = sdkId;
    this.target = target;
    this.lineNumber = lineNumber;
    this.columnNumber = columnNumber;
    this.condition = condition;
    this.enabled = enabled;

    isDirty = false;
  }

  @Override
  public Target getTarget() {
    return target;
  }

  @Override
  public long getId() {
    return sdkId;
  }

  public static final BreakpointTypeExtension TYPE_EXTENSION = new BreakpointTypeExtension() {
    @Override
    public FunctionSupport getFunctionSupport() {
      return null;
    }
    @Override
    public ScriptRegExpSupport getScriptRegExpSupport() {
      return scriptRegExpSupport;
    }

    private final ScriptRegExpSupport scriptRegExpSupport = new ScriptRegExpSupport() {
      @Override
      public Target createTarget(String regExp) {
        return new ScriptRegExpBreakpointTarget(regExp);
      }
    };
  };

  @Override
  public long getLineNumber() {
    return lineNumber;
  }

  @Override
  public boolean isEnabled() {
    return enabled;
  }

  @Override
  public void setEnabled(boolean enabled) {
    if (enabled == this.enabled) {
      return;
    }
    this.enabled = enabled;
    isDirty  = true;
  }

  @Override
  public String getCondition() {
    return condition;
  }

  @Override
  public void setCondition(String condition) {
    if (eq(this.condition, condition)) {
      return;
    }
    this.condition = condition;
    isDirty = true;
  }

  @Override
  public IgnoreCountBreakpointExtension getIgnoreCountBreakpointExtension() {
    return getIgnoreCountBreakpointExtensionImpl();
  }

  public static IgnoreCountBreakpointExtension getIgnoreCountBreakpointExtensionImpl() {
    // TODO(peter.rybin): implement when protocol supports.
    return null;
  }


  void setRemoteData(String protocolId, Collection<ActualLocation> actualLocations) {
    this.protocolId = protocolId;
    this.actualLocations.clear();
    this.actualLocations.addAll(actualLocations);
    breakpointManager.getDb().setIdMapping(this, protocolId);
  }

  void addResolvedLocation(LocationValue locationValue) {
    ActualLocation location = locationFromProtocol(locationValue);
    actualLocations.add(location);
  }

  Set<ActualLocation> getActualLocations() {
    return actualLocations;
  }

  void clearActualLocations() {
    actualLocations.clear();
  }

  void deleteSelfFromDb() {
    if (protocolId != null) {
      breakpointManager.getDb().setIdMapping(this, null);
    }
    breakpointManager.getDb().removeBreakpoint(this);
  }

  @Override
  public RelayOk clear(final BreakpointCallback callback, SyncCallback syncCallback) {
    // TODO: make sure this is thread-safe.
    if (protocolId == null) {
      breakpointManager.getDb().removeBreakpoint(this);
      callback.success(this);
      return RelaySyncCallback.finish(syncCallback);
    }

    WipCommandCallback commandCallback;
    if (callback == null) {
      commandCallback = null;
    }
    else {
      commandCallback = new WipCommandCallbackImpl() {
        @Override
        protected void onSuccess(Success success) {
          breakpointManager.getDb().setIdMapping(WipBreakpointImpl.this, null);
          breakpointManager.getDb().removeBreakpoint(WipBreakpointImpl.this);
          callback.success(WipBreakpointImpl.this);
        }

        @Override
        protected void onError(String message) {
          callback.failure(message);
        }
      };
    }
    return breakpointManager.getCommandProcessor().send(new RemoveBreakpoint(protocolId), commandCallback, syncCallback);
  }

  @Override
  public RelayOk flush(final BreakpointCallback callback, SyncCallback syncCallback) {
    final RelaySyncCallback relay = new RelaySyncCallback(syncCallback);

    if (!isDirty) {
      if (callback != null) {
        callback.success(this);
      }
      return RelaySyncCallback.finish(syncCallback);
    }

    isDirty = false;

    if (protocolId == null) {
      // Breakpoint was disabled, it doesn't exist in VM, immediately start step 2.
      return recreateBreakpointAsync(callback, relay);
    } else {
      // Call syncCallback if something goes wrong after we sent request.
      final RelaySyncCallback.Guard guard = relay.newGuard();

      WipCommandCallback removeCallback = new WipCommandCallbackImpl() {
        @Override
        protected void onSuccess(Success success) {
          setRemoteData(null, Collections.<ActualLocation>emptyList());
          RelayOk relayOk = recreateBreakpointAsync(callback, relay);
          guard.discharge(relayOk);
        }

        @Override
        protected void onError(String message) {
          throw new RuntimeException("Failed to remove breakpoint: " + message);
        }
      };

      // Call syncCallback if something goes wrong.
      return breakpointManager.getCommandProcessor().send(new RemoveBreakpoint(protocolId), removeCallback, guard.asSyncCallback());
    }
  }

  static class ActualLocation {
    private final String sourceId;
    private final int lineNumber;
    private final int columnNumber;

    ActualLocation(String sourceId, int lineNumber, int columnNumber) {
      this.sourceId = sourceId;
      this.lineNumber = lineNumber;
      this.columnNumber = columnNumber;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof ActualLocation)) {
        return false;
      }
      ActualLocation other = (ActualLocation)obj;
      return sourceId.equals(other.sourceId) &&
             lineNumber == other.lineNumber &&
             eq(columnNumber, other.columnNumber);
    }

    @Override
    public int hashCode() {
      return sourceId.hashCode() + 31 * lineNumber + (columnNumber == -1 ? 0 : columnNumber);
    }

    @Override
    public String toString() {
      return "<sourceId=" + sourceId + ", line=" + lineNumber + ", column=" + columnNumber + ">";
    }
  }

  private RelayOk recreateBreakpointAsync(final BreakpointCallback flushCallback,
      RelaySyncCallback relay) {

    if (enabled) {
      SetBreakpointCallback setCommandCallback = new SetBreakpointCallback() {
        @Override
        public void onSuccess(String protocolId, Collection<ActualLocation> actualLocations) {
          setRemoteData(protocolId, actualLocations);
          if (flushCallback != null) {
            flushCallback.success(WipBreakpointImpl.this);
          }
        }

        @Override
        public void onFailure(Exception exception) {
          if (flushCallback != null) {
            flushCallback.failure(exception.getMessage());
          }
        }
      };

      RelaySyncCallback.Guard guard = relay.newGuard();

      if (condition == null) {
        condition = "";
      }
      return sendSetBreakpointRequest(target, lineNumber, columnNumber, condition,
          setCommandCallback, guard.asSyncCallback(),
          breakpointManager.getCommandProcessor());
    } else {
      // Breakpoint is disabled, do not create it.
      RelayOk relayOk;
      try {
        if (flushCallback != null) {
          flushCallback.success(this);
        }
      } finally {
        relayOk = relay.finish();
      }
      return relayOk;
    }
  }

  interface SetBreakpointCallback {
    void onSuccess(String breakpointId, Collection<ActualLocation> actualLocations);
    void onFailure(Exception cause);
  }

  /**
   * @param callback a generic callback that receives breakpoint protocol id
   */
  static RelayOk sendSetBreakpointRequest(Target target, final int lineNumber,
                                          final int columnNumber, final String condition,
                                          final SetBreakpointCallback callback, final SyncCallback syncCallback,
                                          final WipCommandProcessor commandProcessor) {
    return target.accept(new BreakpointTypeExtension.ScriptRegExpSupport.Visitor<RelayOk>() {
      @Override
      public RelayOk visitScriptName(String scriptName) {
        return sendRequest(scriptName, RequestHandler.FOR_URL);
      }

      @Override
      public RelayOk visitRegExp(String regExp) {
        return sendRequest(regExp, RequestHandler.FOR_REGEXP);
      }

      @Override
      public RelayOk visitScriptId(Object scriptId) {
        String scriptIdString = WipScriptManager.convertAlienSourceId(scriptId);
        return sendRequest(scriptIdString, RequestHandler.FOR_ID);
      }

      @Override
      public RelayOk visitUnknown(Target target) {
        throw new IllegalArgumentException();
      }

      private <T, DATA, PARAMS extends RequestWithResponse<DATA, ProtocolReponseReader>> RelayOk sendRequest(T parameter, final RequestHandler<T, DATA, PARAMS> handler) {
        PARAMS requestParams = handler.createRequestParams(parameter, lineNumber, columnNumber, condition);
        GenericCallback<DATA> wrappedCallback;
        if (callback == null) {
          wrappedCallback = null;
        }
        else {
          wrappedCallback = new GenericCallback<DATA>() {
            @Override
            public void success(DATA data) {
              String breakpointId = handler.getBreakpointId(data);
              Collection<LocationValue> locationValues = handler.getActualLocations(data);
              List<ActualLocation> locationList =
                new ArrayList<ActualLocation>(locationValues.size());
              for (LocationValue value : locationValues) {
                locationList.add(locationFromProtocol(value));
              }
              callback.onSuccess(breakpointId, locationList);
            }

            @Override
            public void failure(Exception exception) {
              callback.onFailure(exception);
            }
          };
        }
        return commandProcessor.send(requestParams, wrappedCallback, syncCallback);
      }
    });
  }

  private static abstract class RequestHandler<T, DATA, PARAMS extends RequestWithResponse<DATA, ProtocolReponseReader>> {
    abstract PARAMS createRequestParams(T parameter, int lineNumber, int columnNumber, String condition);

    abstract String getBreakpointId(DATA data);

    abstract Collection<LocationValue> getActualLocations(DATA data);

    static abstract class ForUrlOrRegExp extends RequestHandler<String, SetBreakpointByUrlResult, SetBreakpointByUrl> {
      @Override
      String getBreakpointId(SetBreakpointByUrlResult data) {
        return data.breakpointId();
      }

      @Override
      Collection<LocationValue> getActualLocations(SetBreakpointByUrlResult data) {
        return data.locations();
      }
    }

    static final ForUrlOrRegExp FOR_URL = new ForUrlOrRegExp() {
      @Override
      SetBreakpointByUrl createRequestParams(String url, int lineNumber, int columnNumber, String condition) {
        return new SetBreakpointByUrl(lineNumber).url(url).columnNumber(columnNumber).condition(condition);
      }
    };

    static final ForUrlOrRegExp FOR_REGEXP = new ForUrlOrRegExp() {
      @Override
      SetBreakpointByUrl createRequestParams(String url, int lineNumber, int columnNumber, String condition) {
        return new SetBreakpointByUrl(lineNumber).url(url).columnNumber(columnNumber).condition(condition);
      }
    };

    static final RequestHandler<String, SetBreakpointResult, SetBreakpoint> FOR_ID =
      new RequestHandler<String, SetBreakpointResult, SetBreakpoint>() {
        @Override
        SetBreakpoint createRequestParams(String sourceId, int lineNumber, int columnNumber, String condition) {
          return new SetBreakpoint(new Location(sourceId, lineNumber).columnNumber(columnNumber)).condition(condition);
        }

        @Override
        String getBreakpointId(SetBreakpointResult data) {
          return data.breakpointId();
        }

        @Override
        Collection<LocationValue> getActualLocations(SetBreakpointResult data) {
          return Collections.singletonList(data.actualLocation());
        }
      };
  }

  private static ActualLocation locationFromProtocol(LocationValue locationValue) {
    return new ActualLocation(locationValue.scriptId(), locationValue.lineNumber(), locationValue.columnNumber());
  }

  private static <T> boolean eq(T left, T right) {
    return left == right || (left != null && left.equals(right));
  }
}
