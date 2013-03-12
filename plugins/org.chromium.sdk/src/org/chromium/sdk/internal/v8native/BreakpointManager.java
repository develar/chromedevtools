// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native;

import gnu.trove.TLongObjectHashMap;
import gnu.trove.TLongObjectProcedure;
import gnu.trove.TObjectProcedure;
import org.chromium.sdk.*;
import org.chromium.sdk.Breakpoint.Target;
import org.chromium.sdk.JavascriptVm.BreakpointCallback;
import org.chromium.sdk.JavascriptVm.ExceptionCatchMode;
import org.chromium.sdk.JavascriptVm.ListBreakpointsCallback;
import org.chromium.sdk.internal.ScriptRegExpBreakpointTarget;
import org.chromium.sdk.internal.v8native.BreakpointImpl.FunctionTarget;
import org.chromium.sdk.internal.v8native.protocol.input.CommandResponse;
import org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody;
import org.chromium.sdk.internal.v8native.protocol.input.FlagsBody;
import org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo;
import org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo;
import org.chromium.sdk.internal.v8native.protocol.output.ClearBreakpointMessage;
import org.chromium.sdk.internal.v8native.protocol.output.FlagsMessage;
import org.chromium.sdk.internal.v8native.protocol.output.ListBreakpointsMessage;
import org.chromium.sdk.util.GenericCallback;
import org.chromium.sdk.util.RelaySyncCallback;
import org.jetbrains.v8.protocol.Changebreakpoint;
import org.jetbrains.v8.protocol.Setbreakpoint;
import org.jetbrains.v8.protocol.SetbreakpointResult;

import java.util.*;
import java.util.logging.Logger;

public class BreakpointManager {
  /** The class logger. */
  private static final Logger LOGGER = Logger.getLogger(BreakpointManager.class.getName());

  /**
   * This map shall contain only breakpoints with valid IDs.
   * Complex operations must be explicitly synchronized on this instance.
   */
  private final TLongObjectHashMap<BreakpointImpl> idToBreakpoint = new TLongObjectHashMap<BreakpointImpl>();

  private final DebugSession debugSession;

  public BreakpointManager(DebugSession debugSession) {
    this.debugSession = debugSession;
  }

  DebugSession getDebugSession() {
    return debugSession;
  }

  public BreakpointTypeExtension getBreakpointTypeExtension() {
    return breakpointTypeExtension;
  }

  public RelayOk setBreakpoint(Breakpoint.Target target, int line, int column,
      boolean enabled, String condition,
      JavascriptVm.BreakpointCallback callback, SyncCallback syncCallback) {
    return setBreakpoint(target, line, column, enabled, condition, Breakpoint.EMPTY_VALUE,
        callback, syncCallback);
  }

  private static final BreakpointImpl.TargetExtendedVisitor<String> GET_TYPE_VISITOR =
    new BreakpointImpl.TargetExtendedVisitor<String>() {
      @Override
      public String visitFunction(String expression) {
        return "function";
      }

      @Override
      public String visitScriptName(String scriptName) {
        return "script";
      }

      @Override
      public String visitScriptId(Object scriptId) {
        return "scriptId";
      }

      @Override
      public String visitRegExp(String regExp) {
        return "scriptRegExp";
      }

      @Override
      public String visitUnknown(Target target) {
        throw new IllegalArgumentException();
      }
    };

  private static final BreakpointImpl.TargetExtendedVisitor<String> GET_TARGET_VISITOR =
    new BreakpointImpl.TargetExtendedVisitor<String>() {
      @Override
      public String visitFunction(String expression) {
        return expression;
      }

      @Override
      public String visitScriptName(String scriptName) {
        return scriptName;
      }

      @Override
      public String visitScriptId(Object scriptIdObj) {
        if (scriptIdObj instanceof Long) {
          return scriptIdObj.toString();
        }
        throw new IllegalStateException("Script id must be of type Long");
      }

      @Override
      public String visitRegExp(String regExp) {
        return regExp;
      }

      @Override
      public String visitUnknown(Target target) {
        throw new IllegalArgumentException();
      }
    };

  RelayOk setBreakpoint(final Breakpoint.Target target, final int line, int column,
                        final boolean enabled, final String condition, int ignoreCount,
                        final JavascriptVm.BreakpointCallback callback, SyncCallback syncCallback) {
    return debugSession.getCommandProcessor().sendAsync(new Setbreakpoint(target.accept(GET_TYPE_VISITOR), target.accept(GET_TARGET_VISITOR), line).column(column).condition(condition).ignoreCount(ignoreCount).enabled(enabled),
                                                        new V8CommandCallbackWithResponse<SetbreakpointResult, Void>() {
                                                          @Override
                                                          protected Void success(SetbreakpointResult result, CommandResponse.Success response) {
                                                            BreakpointImpl breakpoint = new BreakpointImpl(result.breakpoint(), target, line, enabled, condition, BreakpointManager.this);
                                                            idToBreakpoint.put(breakpoint.getId(), breakpoint);
                                                            if (callback != null) {
                                                              callback.success(breakpoint);
                                                            }
                                                            return null;
                                                          }

                                                          @Override
                                                          public void onError(String message) {
                                                            if (callback != null) {
                                                              callback.failure(message);
                                                            }
                                                          }
                                                        },
                                                        syncCallback);
  }

  public Breakpoint getBreakpoint(long id) {
    return idToBreakpoint.get(id);
  }

  public RelayOk clearBreakpoint(BreakpointImpl breakpointImpl, final BreakpointCallback callback, SyncCallback syncCallback, long originalId) {
    if (originalId == Breakpoint.INVALID_ID) {
      return RelaySyncCallback.finish(syncCallback);
    }
    idToBreakpoint.remove(originalId);
    return debugSession.sendMessage(
      new ClearBreakpointMessage(originalId),
      new V8CommandCallbackBase() {
        @Override
        public void success(CommandResponse.Success successResponse) {
          if (callback != null) {
            callback.success(null);
          }
        }

        @Override
        public void failure(String message) {
          if (callback != null) {
            callback.failure(message);
          }
        }
      },
      syncCallback);
  }

  public RelayOk changeBreakpoint(final BreakpointImpl breakpointImpl, final BreakpointCallback callback, SyncCallback syncCallback) {
    return debugSession.sendMessage(new Changebreakpoint(breakpointImpl.getId()).enabled(breakpointImpl.isEnabled()).condition(breakpointImpl.getCondition()),
                                    new V8CommandCallbackBase() {
                                      @Override
                                      public void success(CommandResponse.Success successResponse) {
                                        if (callback != null) {
                                          callback.success(breakpointImpl);
                                        }
                                      }

                                      @Override
                                      public void failure(String message) {
                                        if (callback != null) {
                                          callback.failure(message);
                                        }
                                      }
                                    },
                                    syncCallback);
  }

  /**
   * Reads a list of breakpoints from remote and updates local instances and the map.
   * @return
   */
  public RelayOk reloadBreakpoints(final ListBreakpointsCallback callback,
      SyncCallback syncCallback) {
    V8CommandCallbackBase v8Callback = new V8CommandCallbackBase() {
      @Override
      public void failure(String message) {
        callback.failure(new Exception(message));
      }
      @Override
      public void success(CommandResponse.Success successResponse) {
        CommandResponseBody body = successResponse.body();
        List<BreakpointInfo> infos = body.asListBreakpointsBody().breakpoints();
        Collection<Breakpoint> updatedBreakpoints;
        try {
          updatedBreakpoints = syncBreakpoints(infos);
        } catch (RuntimeException e) {
          callback.failure(new Exception("Failed to read server response", e));
          return;
        }
        callback.success(Collections.unmodifiableCollection(updatedBreakpoints));
      }
    };
    return debugSession.sendMessage(new ListBreakpointsMessage(), v8Callback, syncCallback);
  }

  public RelayOk enableBreakpoints(boolean enabled, GenericCallback<Boolean> callback, SyncCallback syncCallback) {
    return setRemoteFlag("breakPointsActive", enabled, callback, syncCallback);
  }

  public RelayOk setBreakOnException(ExceptionCatchMode catchMode,
      final GenericCallback<ExceptionCatchMode> callback, SyncCallback syncCallback) {

    boolean[] flagValues;
    if (catchMode == null) {
      flagValues = new boolean[0];
    } else {
      boolean caughtValue;
          boolean uncaughtValue;
      switch (catchMode) {
        case ALL:
          caughtValue = true;
          uncaughtValue = true;
          break;
        case NONE:
          caughtValue = false;
          uncaughtValue = false;
          break;
        case UNCAUGHT:
          caughtValue = false;
          uncaughtValue = true;
          break;
        default:
          throw new RuntimeException();
      }
      flagValues = new boolean[]{caughtValue, uncaughtValue};
    }

    GenericCallback<List<Boolean>> wrappedCallback;
    if (callback == null) {
      wrappedCallback = null;
    } else {
      wrappedCallback = new GenericCallback<List<Boolean>>() {
        @Override
        public void success(List<Boolean> values) {
          ExceptionCatchMode newCatchMode;
          if (values.get(0)) {
            if (values.get(1)) {
              newCatchMode = ExceptionCatchMode.ALL;
            } else {
              // We cannot fit this combination into ExceptionCatchMode.
              newCatchMode = null;
            }
          } else {
            if (values.get(1)) {
              newCatchMode = ExceptionCatchMode.UNCAUGHT;
            } else {
              newCatchMode = ExceptionCatchMode.NONE;
            }
          }
          callback.success(newCatchMode);
        }

        @Override public void failure(Exception exception) {
          callback.failure(exception);
        }
      };
    }

    return setRemoteFlags(BREAK_ON_EXCEPTION_FLAG_NAMES, flagValues, wrappedCallback, syncCallback);
  }

  private static final List<String> BREAK_ON_EXCEPTION_FLAG_NAMES =
      Arrays.asList("breakOnCaughtException", "breakOnUncaughtException");

  private RelayOk setRemoteFlag(String flagName, boolean value, final GenericCallback<Boolean> callback, SyncCallback syncCallback) {
    GenericCallback<List<Boolean>> wrappedCallback;
    if (callback == null) {
      wrappedCallback = null;
    } else {
      wrappedCallback = new GenericCallback<List<Boolean>>() {
        @Override public void success(List<Boolean> value) {
          callback.success(value.get(0));
        }
        @Override public void failure(Exception exception) {
          callback.failure(exception);
        }
      };
    }
    return setRemoteFlags(Collections.singletonList(flagName), new boolean[]{value}, wrappedCallback, syncCallback);
  }

  private RelayOk setRemoteFlags(final List<String> flagNames, boolean[] values, final GenericCallback<List<Boolean>> callback, SyncCallback syncCallback) {
    Map<String, Boolean> flagMap = new HashMap<String, Boolean>(values.length);
    for (int i = 0; i < flagNames.size(); i++) {
      flagMap.put(flagNames.get(i), values[i]);
    }
    V8CommandCallback v8Callback;
    if (callback == null) {
      v8Callback = null;
    } else {
      v8Callback = new V8CommandCallbackBase() {
        @Override public void success(CommandResponse.Success successResponse) {
          List<FlagInfo> flagList = successResponse.body().asFlagsBody().flags();
          List<Boolean> result = new ArrayList<Boolean>(flagNames.size());
          for (String name : flagNames) {

            FlagsBody.FlagInfo flag;

            findCorrectFlag: {
              for (FlagsBody.FlagInfo f : flagList) {
                if (name.equals(f.name())) {
                  flag = f;
                  break findCorrectFlag;
                }
              }
              throw new RuntimeException("Failed to find the correct flag in response");
            }

            Object flagValue = flag.value();
            Boolean boolValue;
            if (!(flagValue instanceof Boolean)) {
              LOGGER.info("Flag value has a wrong type");
              boolValue = null;
            } else {
              boolValue = (Boolean) flagValue;
            }
            result.add(boolValue);
          }
          callback.success(result);
        }
        @Override public void failure(String message) {
          callback.failure(new Exception(message));
        }
      };
    }
    return debugSession.sendMessage(new FlagsMessage(flagMap), v8Callback, syncCallback);
  }

  private Collection<Breakpoint> syncBreakpoints(List<BreakpointInfo> infoList) {
    synchronized (idToBreakpoint) {
      final ArrayList<Breakpoint> result = new ArrayList<Breakpoint>();
      final TLongObjectHashMap<BreakpointImpl> actualBreakpoints = new TLongObjectHashMap<BreakpointImpl>();
      // Wrap all loaded BreakpointInfo as BreakpointImpl, possibly reusing old instances.
      // Also check that all breakpoint id's in loaded list are unique.
      for (BreakpointInfo info : infoList) {
        if (info.type() == BreakpointInfo.Type.FUNCTION) {
          // We don't support function type breakpoints and ignore them.
          continue;
        }
        BreakpointImpl breakpoint = idToBreakpoint.get(info.number());
        if (breakpoint == null) {
          breakpoint = new BreakpointImpl(info, this);
        } else {
          breakpoint.updateFromRemote(info);
        }
        Object conflict = actualBreakpoints.put(info.number(), breakpoint);
        if (conflict != null) {
          throw new RuntimeException("Duplicated breakpoint number " + info.number());
        }
        result.add(breakpoint);
      }

      // Remove all obsolete breakpoints from the map
      idToBreakpoint.retainEntries(new TLongObjectProcedure<BreakpointImpl>() {
        @Override
        public boolean execute(long id, BreakpointImpl b) {
          return actualBreakpoints.containsKey(id);
        }
      });

      // Add breakpoints that are not in the main map yet
      actualBreakpoints.forEachValue(new TObjectProcedure<BreakpointImpl>() {
        @Override
        public boolean execute(BreakpointImpl breakpoint) {
          if (!idToBreakpoint.containsKey(breakpoint.getId())) {
            idToBreakpoint.put(breakpoint.getId(), breakpoint);
            result.add(breakpoint);
          }
          return true;
        }
      });
      return result;
    }
  }

  private final BreakpointTypeExtension breakpointTypeExtension = new BreakpointTypeExtension() {
    @Override
    public FunctionSupport getFunctionSupport() {
      return functionSupport;
    }

    private final FunctionSupport functionSupport = new FunctionSupport() {
      @Override
      public Target createTarget(String expression) {
        return new FunctionTarget(expression);
      }
    };

    @Override
    public ScriptRegExpSupport getScriptRegExpSupport() {
      if (!V8VersionFeatures.isRegExpBreakpointSupported(debugSession.getVmVersion())) {
        return null;
      }
      return scriptRegExpSupport;
    }

    private final ScriptRegExpSupport scriptRegExpSupport = new ScriptRegExpSupport() {
      @Override
      public Target createTarget(String regExp) {
        return new ScriptRegExpBreakpointTarget(regExp);
      }
    };

  };
}
