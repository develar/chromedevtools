// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native;

import org.chromium.sdk.CallbackSemaphore;
import org.chromium.sdk.JsValue.Type;
import org.chromium.sdk.RelayOk;
import org.chromium.sdk.SyncCallback;
import org.chromium.sdk.internal.v8native.protocol.V8ProtocolUtil;
import org.chromium.sdk.internal.v8native.protocol.input.CommandResponse;
import org.chromium.sdk.internal.v8native.protocol.input.FrameObject;
import org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef;
import org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle;
import org.chromium.sdk.internal.v8native.protocol.output.ContextlessDebuggerMessage;
import org.chromium.sdk.internal.v8native.protocol.output.ScriptsMessage;
import org.chromium.sdk.internal.v8native.value.JsDataTypeUtil;
import org.chromium.sdk.internal.v8native.value.LoadableString;
import org.chromium.sdk.internal.v8native.value.PropertyReference;
import org.chromium.sdk.internal.v8native.value.ValueLoadException;
import org.jetbrains.jsonProtocol.RequestWithResponse;
import org.jetbrains.v8.protocol.ProtocolReponseReader;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * A helper class for performing complex V8-related operations.
 */
public class V8Helper {

  public interface ScriptLoadCallback {
    void success();
    void failure(String message);
  }

  /**
   * Loads all scripts and stores them in ScriptManager.
   * @param callback to invoke when the script reloading has completed
   * @param syncCallback to invoke after callback whether it normally returned
   *     or threw an exception
   */
  public static RelayOk reloadAllScriptsAsync(DebugSession debugSession, ScriptLoadCallback callback, SyncCallback syncCallback) {
    return reloadScriptAsync(debugSession, null, callback, syncCallback);
  }

  /**
   * Loads specified scripts or all existing scripts and stores them in ScriptManager.
   * @param ids ids of requested scripts or null for all scripts
   * @param callback to invoke when the script reloading has completed
   * @param syncCallback to invoke after callback, regardless of whether it has returned normally
   *        or thrown an exception
   */
  public static RelayOk reloadScriptAsync(final DebugSession debugSession, final long[] ids,
      final ScriptLoadCallback callback, SyncCallback syncCallback) {
    ContextlessDebuggerMessage message;
    if (ids == null) {
      message = new ScriptsMessage(ScriptsMessage.SCRIPTS_NORMAL, true);
    } else {
      message = new ScriptsMessage(ids, true);
    }
    return debugSession.sendMessage(message,
      new V8CommandCallbackBase() {
        @Override
        public void failure(String message) {
          if (callback != null) {
            callback.failure(message);
          }
        }

        @Override
        public void success(CommandResponse.Success successResponse) {
          List<ScriptHandle> body;
          try {
            body = successResponse.body().asScripts();
          }
          catch (IOException e) {
            throw new RuntimeException(e);
          }
          ScriptManager scriptManager = debugSession.getScriptManager();
          for (ScriptHandle scriptHandle : body) {
            if (V8Helper.JAVASCRIPT_VOID.equals(scriptHandle.source())) {
              continue;
            }
            Long id = V8ProtocolUtil.getScriptIdFromResponse(scriptHandle);
            ScriptImpl scriptById = scriptManager.findById(id);
            if (scriptById == null) {
              scriptManager.addScript(scriptHandle, successResponse.refs());
            }
            else {
              // A scrupulous refactoring note:
              // do not call setSource in a legacy case, when ids parameter is null.
              if (ids != null) {
                scriptById.setSource(scriptHandle.source());
              }
            }
          }
          if (callback != null) {
            callback.success();
          }
        }
      },
      syncCallback);
  }

  public static PropertyReference computeReceiverRef(FrameObject frame) {
    SomeRef receiverObject = frame.receiver();
    return V8ProtocolUtil.extractProperty(receiverObject,
        V8ProtocolUtil.PropertyNameGetter.THIS);
  }

  public static LoadableString createLoadableString(ValueHandle handle,
      LoadableString.Factory stringFactory) {
    Long len = handle.length();
    Long toIndex = handle.toIndex();
    if (len != null && toIndex != null && len.longValue() != toIndex.longValue()) {
      // String is not fully loaded.
      return stringFactory.create(handle);
    }
    return new LoadableString.Immutable(handle.text());
  }

  public static Type calculateType(String typeString, String className, boolean tolerateNullType) {
    Type type = JsDataTypeUtil.fromJsonTypeAndClassName(typeString, className);
    if (type == null) {
      if (tolerateNullType) {
        type = Type.TYPE_OBJECT;
      } else {
        throw new ValueLoadException("Bad value object");
      }
    }
    return type;
  }

  public static <RESULT, PROCESSED_RESULT> PROCESSED_RESULT callV8Sync(V8CommandSender commandSender,
                                                                       RequestWithResponse<RESULT, ProtocolReponseReader> message,
                                                                       V8CommandCallbackWithResponse<RESULT, PROCESSED_RESULT> callback) {
    return callV8Sync(commandSender, message, callback, CallbackSemaphore.OPERATION_TIMEOUT_MS);
  }

  public static <RESULT, PROCESSED_RESULT> PROCESSED_RESULT callV8Sync(V8CommandSender commandSender,
                                                                       RequestWithResponse<RESULT, ProtocolReponseReader> message,
                                                                       final V8CommandCallbackWithResponse<RESULT, PROCESSED_RESULT> callback,
                                                                       long timeoutMs) {
    callback.request = message;

    final String[] exceptionRef = {null};
    V8CommandCallback callbackWrapper = new V8CommandCallback() {
      @Override
      public void failure(String message) {
        exceptionRef[0] = message;
      }

      @Override
      public void messageReceived(CommandResponse response) {
        callback.messageReceived(response);
      }
    };

    CallbackSemaphore syncCallback = new CallbackSemaphore();
    commandSender.sendV8CommandAsync(message, true, callbackWrapper, syncCallback);
    boolean waitResult;
    try {
      waitResult = syncCallback.tryAcquire(timeoutMs, TimeUnit.MILLISECONDS);
    }
    catch (RuntimeException e) {
      throw new CallbackException(e);
    }

    if (!waitResult) {
      throw new CallbackException("Timeout");
    }

    if (exceptionRef[0] != null) {
      throw new CallbackException(exceptionRef[0]);
    }
    return callback.result;
  }

  /**
   * A no-op JavaScript to evaluate.
   */
  public static final String JAVASCRIPT_VOID = "javascript:void(0);";

  /**
   * Special kind of exceptions for problems in receiving or waiting for the answer.
   * Clients may try to catch it.
   */
  public static final class CallbackException extends RuntimeException {
    CallbackException(String message) {
      super(message);
    }

    CallbackException(Throwable cause) {
      super(cause);
    }
  }
}
