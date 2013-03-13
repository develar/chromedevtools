// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.sdk.DebugEventListener;
import org.chromium.sdk.RelayOk;
import org.chromium.sdk.SyncCallback;
import org.chromium.sdk.internal.BaseCommandProcessor;
import org.chromium.sdk.internal.v8native.protocol.input.CommandResponse;
import org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage;
import org.chromium.sdk.internal.v8native.protocol.input.MessageType;
import org.chromium.v8.protocol.ProtocolService;
import org.jetbrains.jsonProtocol.Request;
import org.jetbrains.jsonProtocol.RequestWithResponse;
import org.jetbrains.rpc.MessageHandler;
import org.jetbrains.v8.protocol.ProtocolReponseReader;

/**
 * Sends JSON commands to V8 VM and handles responses. Command is sent
 * via {@code V8CommandOutput}. Response is passed back to callback if it was provided.
 * Also all responses and events are dispatched to group of dedicated processors.
 */
public class V8CommandProcessor implements V8CommandSender {
  private final V8CommandOutput messageOutput;

  private final DefaultResponseHandler defaultResponseHandler;

  private final DebugSession debugSession;

  private final BaseCommandProcessor<Request, IncomingMessage, CommandResponse> baseCommandProcessor;

  public V8CommandProcessor(V8CommandOutput messageOutput, DefaultResponseHandler defaultResponseHandler, DebugSession debugSession) {
    this.messageOutput = messageOutput;
    this.defaultResponseHandler = defaultResponseHandler;
    this.debugSession = debugSession;
    baseCommandProcessor = new BaseCommandProcessor<Request, IncomingMessage, CommandResponse>(new V8MessageHandler());
  }

  @Override
  public RelayOk sendV8CommandAsync(Request message, boolean isImmediate, V8CommandCallback callback, SyncCallback syncCallback) {
    return baseCommandProcessor.send(message, isImmediate, callback, syncCallback);
  }

  //@Override
  public <RESULT> RelayOk sendAsync(RequestWithResponse<RESULT, ProtocolReponseReader> message, V8CommandCallbackWithResponse<RESULT, Void> callback, SyncCallback syncCallback) {
    callback.request = message;
    return baseCommandProcessor.send(message, false, callback, syncCallback);
  }

  public RelayOk runInDispatchThread(final Runnable callback, final SyncCallback syncCallback) {
    Runnable innerRunnable = new Runnable() {
      @Override public void run() {
        RuntimeException exception = null;
        try {
          callback.run();
        } catch (RuntimeException e) {
          exception = e;
          throw e;
        } finally {
          if (syncCallback != null) {
            syncCallback.callbackDone(exception);
          }
        }
      }
    };
    messageOutput.runInDispatchThread(innerRunnable);
    return DISPATCH_THREAD_PROMISES_TO_CALL;
  }

  public void processIncomingJson(JsonReaderEx jsonReader) {
    baseCommandProcessor.processIncoming(ProtocolService.PROTOCOL_READER.readIncomingMessage(jsonReader));
  }

  public void processEos() {
    baseCommandProcessor.processEos();
  }

  private class V8MessageHandler extends MessageHandler<IncomingMessage, CommandResponse> {
    public void send(Request message, boolean isImmediate) {
      messageOutput.send(message, isImmediate);
    }

    public CommandResponse readIfHasSequence(IncomingMessage incoming) {
      return incoming.type() == MessageType.RESPONSE ? incoming.asResponse() : null;
    }

    public int getSequence(CommandResponse incomingWithSeq) {
      return incomingWithSeq.requestSeq();
    }

    public void acceptNonSequence(IncomingMessage incoming) {
      defaultResponseHandler.handleResponseWithHandler(incoming);
    }

    public void reportVmStatus(String currentRequest, int numberOfEnqueued) {
      //noinspection UnusedDeclaration
      DebugEventListener.VmStatusListener statusListener = debugSession.getDebugEventListener().getVmStatusListener();
      //if (statusListener == null) {
      //  return;
      //}
    }
  }

  private static final RelayOk DISPATCH_THREAD_PROMISES_TO_CALL = new RelayOk() {};
}