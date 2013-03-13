// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.wip;

import org.chromium.sdk.*;
import org.chromium.sdk.internal.websocket.WsConnection;
import org.chromium.sdk.util.GenericCallback;
import org.chromium.sdk.util.MethodIsBlockingException;
import org.chromium.sdk.util.RelaySyncCallback;
import org.chromium.sdk.util.SignalRelay;
import org.chromium.sdk.util.SignalRelay.AlreadySignalledException;
import org.chromium.sdk.wip.*;
import org.jetbrains.wip.protocol.debugger.Enable;
import org.jetbrains.wip.protocol.debugger.Pause;
import org.jetbrains.wip.protocol.debugger.SetBreakpointsActive;
import org.jetbrains.wip.protocol.debugger.SetPauseOnExceptions;
import org.jetbrains.jsonProtocol.JsonReaders;
import org.jetbrains.wip.protocol.CommandResponse.Success;
import org.jetbrains.wip.protocol.WipRequest;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * {@link BrowserTab} implementation that attaches to remote tab via WebInspector
 * protocol (WIP).
 */
public class WipTabImpl implements WipBrowserTab, WipJavascriptVm {
  private static final Logger LOGGER = Logger.getLogger(WipTabImpl.class.getName());

  private final WsConnection socket;
  private final WipBrowserImpl browserImpl;
  private final TabDebugEventListener tabListener;
  private final WipCommandProcessor commandProcessor;
  private final WipScriptManager scriptManager = new WipScriptManager(this);
  private final WipBreakpointManager breakpointManager = new WipBreakpointManager(this);
  private final WipContextBuilder contextBuilder = new WipContextBuilder(this);
  private final WipFrameManager frameManager = new WipFrameManager(this);

  private final VmState vmState = new VmState();
  private final SignalRelay<Void> closeSignalRelay;

  private volatile String url;

  public WipTabImpl(WsConnection socket, WipBrowserImpl browserImpl,
      TabDebugEventListener tabListener, String preliminaryUrl) throws IOException {
    this.socket = socket;
    this.browserImpl = browserImpl;
    this.tabListener = tabListener;
    url = preliminaryUrl;

    closeSignalRelay = SignalRelay.create(new SignalRelay.Callback<Void>() {
      @Override
      public void onSignal(Void signal, Exception cause) {
        WipTabImpl.this.tabListener.closed();
        WipTabImpl.this.tabListener.getDebugEventListener().disconnected();
      }
    });

    try {
      closeSignalRelay.bind(socket.getCloser(), null, null);
    } catch (AlreadySignalledException e) {
      throw new IOException("Connection is closed", e);
    }

    commandProcessor = new WipCommandProcessor(this);

    WsConnection.Listener socketListener = new WsConnection.Listener() {
      @Override
      public void textMessageReceived(CharSequence text) {
        commandProcessor.acceptResponse(WipReaderService.get().readIncomingMessage(JsonReaders.createReader(text)));
      }

      @Override
      public void errorMessage(Exception ex) {
        LOGGER.log(Level.SEVERE, "WebSocket protocol error", ex);
      }

      @Override
      public void eofMessage() {
        commandProcessor.processEos();
      }
    };

    socket.startListening(socketListener);

    init();
  }

  private void init() {
    SyncCallback syncCallback = new SyncCallback() {
      @Override
      public void callbackDone(RuntimeException e) {
        // This statement suits sync callback more rather than a regular callback:
        // it's safe enough and we prefer to execute it event if the command failed.
        scriptManager.endPopulateScriptMode();
      }
    };

    commandProcessor.send(new Enable(), null, syncCallback);
    commandProcessor.send(new org.jetbrains.wip.protocol.page.Enable(), null, null);
    frameManager.readFrames();
  }

  void updateUrl(String url, boolean silent) {
    this.url = url;
    if (silent) {
      return;
    }
    scriptManager.pageReloaded();
    breakpointManager.clearNonProvisionalBreakpoints();
    tabListener.navigated(this.url);
    contextBuilder.getEvaluateHack().pageReloaded();
  }

  WipScriptManager getScriptManager() {
    return scriptManager;
  }

  WipBreakpointManager getBreakpointManager() {
    return breakpointManager;
  }

  @Override
  public boolean detach() {
    closeSignalRelay.sendSignal(null, null);
    return true;
  }

  @Override
  public boolean isAttached() {
    return !closeSignalRelay.isSignalled();
  }

  @Override
  public PermanentRemoteValueMapping createPermanentValueMapping(String id) {
    return new PermanentRemoteValueMappingImpl(this, id);
  }

  @Override
  public RelayOk enableBreakpoints(boolean enabled, GenericCallback<Boolean> callback, SyncCallback syncCallback) {
    return updateVmVariable(enabled, VmState.BREAKPOINTS_ACTIVE, callback, syncCallback);
  }

  @Override
  public RelayOk setBreakOnException(ExceptionCatchMode catchMode,
      GenericCallback<ExceptionCatchMode> callback, SyncCallback syncCallback) {

    VmState.Variable<ExceptionCatchMode> variable = VmState.BREAK_ON_EXCEPTION;
    return updateVmVariable(catchMode, variable, callback, syncCallback);
  }

  /**
   * Updates locally saved variables state and send request to remote. If user only calls
   * the method to learn the current value, request is sent anyway, to keep responses in sequence.
   * @return
   */
  private <T> RelayOk updateVmVariable(T value, VmState.Variable<T> variable,
                                       final GenericCallback<T> callback, SyncCallback syncCallback) {
    synchronized (vmState) {
      final T newValue;
      if (value == null) {
        newValue = variable.getValue(vmState);
      }
      else {
        variable.setValue(vmState, value);
        newValue = value;
      }
      WipCommandCallback wrappedCallback;
      if (callback == null) {
        wrappedCallback = null;
      }
      else {
        wrappedCallback = new WipCommandCallbackImpl() {
          @Override
          protected void onSuccess(Success success) {
            callback.success(newValue);
          }

          @Override
          protected void onError(String message) {
            callback.failure(new Exception(message));
          }
        };
      }
      return commandProcessor.send(variable.createRequestParams(vmState), wrappedCallback, syncCallback);
    }
  }

  @Override
  public Version getVersion() {
    // TODO(peter.rybin): support it.
    return new Version(Arrays.asList(0, 0), " <Unknown V8 version>");
  }

  @Override
  public BreakpointTypeExtension getBreakpointTypeExtension() {
    return WipBreakpointImpl.TYPE_EXTENSION;
  }

  @Override
  public IgnoreCountBreakpointExtension getIgnoreCountBreakpointExtension() {
    return WipBreakpointImpl.getIgnoreCountBreakpointExtensionImpl();
  }

  @Override
  public EvaluateToMappingExtension getEvaluateWithDestinationMappingExtension() {
    return WipEvaluateContextBase.EVALUATE_TO_MAPPING_EXTENSION;
  }

  @Override
  public FunctionScopeExtension getFunctionScopeExtension() {
    return WipValueBuilder.FUNCTION_SCOPE_EXTENSION;
  }

  @Override
  public RestartFrameExtension getRestartFrameExtension() {
    return WipContextBuilder.RESTART_FRAME_EXTENSION;
  }

  @Override
  public void getScripts(final ScriptsCallback callback) throws MethodIsBlockingException {
    CallbackSemaphore callbackSemaphore = new CallbackSemaphore();
    GenericCallback<Collection<Script>> innerCallback;
    if (callback == null) {
      innerCallback = null;
    }
    else {
      innerCallback = new GenericCallback<Collection<Script>>() {
        @Override
        public void success(Collection<Script> value) {
          callback.success(value);
        }

        @Override
        public void failure(Exception exception) {
          callback.failure(exception.getMessage());
        }
      };
    }
    callbackSemaphore.acquireDefault(scriptManager.getScripts(innerCallback, callbackSemaphore));
  }

  @Override
  public RelayOk setBreakpoint(Breakpoint.Target target, int line, int column,
      boolean enabled, String condition,
      BreakpointCallback callback, SyncCallback syncCallback) {
    return breakpointManager.setBreakpoint(target, line, column, enabled, condition,
        callback, syncCallback);
  }

  @Override
  public void suspend(final SuspendCallback callback) {
    WipCommandCallback wrappedCallback;
    if (callback == null) {
      wrappedCallback = null;
    } else {
      wrappedCallback = new WipCommandCallbackImpl() {
        @Override protected void onSuccess(Success success) {
          callback.success();
        }
        @Override protected void onError(String message) {
          callback.failure(new Exception(message));
        }
      };
    }
    commandProcessor.send(new Pause(), wrappedCallback, null);
  }

  @Override
  public RelayOk listBreakpoints(ListBreakpointsCallback callback,
      SyncCallback syncCallback) {
    if (callback != null) {
      callback.success(breakpointManager.getAllBreakpoints());
    }
    return RelaySyncCallback.finish(syncCallback);
  }

  @Override
  public WipBrowser getBrowser() {
    return browserImpl;
  }

  @Override
  public WipJavascriptVm getJavascriptVm() {
    return this;
  }

  @Override
  public String getUrl() {
    return url;
  }

  public TabDebugEventListener getDebugListener() {
    return tabListener;
  }

  public WsConnection getWsSocket() {
    return socket;
  }

  WipContextBuilder getContextBuilder() {
    return contextBuilder;
  }

  WipCommandProcessor getCommandProcessor() {
    return commandProcessor;
  }

  WipFrameManager getFrameManager() {
    return frameManager;
  }

  TabDebugEventListener getTabListener() {
    return tabListener;
  }

  /**
   * Saves currently set VM parameters. Default values must correspond to those
   * of WebInspector protocol.
   */
  private static class VmState {
    // TODO: get protocol declare this default value explicitly.
    private static final boolean DEFAULT_BREAKPOINTS_ACTIVE = true;

    // TODO: get protocol declare this default value explicitly.
    private static final ExceptionCatchMode DEFAULT_CATCH_MODE = ExceptionCatchMode.NONE;

    boolean breakpointsActive = DEFAULT_BREAKPOINTS_ACTIVE;

    // TODO: do we know default value?
    ExceptionCatchMode breakOnExceptionMode = DEFAULT_CATCH_MODE;

    static abstract class Variable<T> {
      abstract T getValue(VmState vmState);
      abstract void setValue(VmState vmState, T value);
      abstract WipRequest createRequestParams(VmState vmState);
    }

    static final Variable<Boolean> BREAKPOINTS_ACTIVE = new Variable<Boolean>() {
      @Override Boolean getValue(VmState vmState) {
        return vmState.breakpointsActive;
      }
      @Override void setValue(VmState vmState, Boolean value) {
        vmState.breakpointsActive = value;
      }
      @Override
      WipRequest createRequestParams(VmState vmState) {
        return new SetBreakpointsActive(vmState.breakpointsActive);
      }
    };

    static final Variable<ExceptionCatchMode> BREAK_ON_EXCEPTION =
        new Variable<ExceptionCatchMode>() {
      @Override ExceptionCatchMode getValue(VmState vmState) {
        return vmState.breakOnExceptionMode;
      }
      @Override void setValue(VmState vmState, ExceptionCatchMode value) {
        vmState.breakOnExceptionMode = value;
      }
      @Override
      WipRequest createRequestParams(VmState vmState) {
        return vmState.createPauseOnExceptionRequest();
      }
    };

    private SetPauseOnExceptions createPauseOnExceptionRequest() {
      return new SetPauseOnExceptions(SDK_TO_WIP_CATCH_MODE.get(breakOnExceptionMode));
    }

    private static Map<ExceptionCatchMode, SetPauseOnExceptions.State> SDK_TO_WIP_CATCH_MODE;
    static {
      SDK_TO_WIP_CATCH_MODE = new EnumMap<ExceptionCatchMode, SetPauseOnExceptions.State>(ExceptionCatchMode.class);
      SDK_TO_WIP_CATCH_MODE.put(ExceptionCatchMode.ALL, SetPauseOnExceptions.State.ALL);
      SDK_TO_WIP_CATCH_MODE.put(ExceptionCatchMode.UNCAUGHT, SetPauseOnExceptions.State.UNCAUGHT);
      SDK_TO_WIP_CATCH_MODE.put(ExceptionCatchMode.NONE, SetPauseOnExceptions.State.NONE);
      assert SDK_TO_WIP_CATCH_MODE.size() == ExceptionCatchMode.values().length;
    }
  }
}
