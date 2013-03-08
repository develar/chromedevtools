// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native;

import com.google.gson.stream.JsonReader;
import org.chromium.sdk.DebugEventListener;
import org.chromium.sdk.RelayOk;
import org.chromium.sdk.SyncCallback;
import org.chromium.sdk.internal.BaseCommandProcessor;
import org.chromium.sdk.internal.v8native.protocol.input.CommandResponse;
import org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage;
import org.chromium.sdk.internal.v8native.protocol.input.MessageType;
import org.chromium.sdk.internal.v8native.protocol.output.V8Request;
import org.chromium.v8.protocol.ProtocolService;
import org.jetbrains.jsonProtocol.Request;
import org.jetbrains.rpc.MessageHandler;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sends JSON commands to V8 VM and handles responses. Command is sent
 * via {@code V8CommandOutput}. Response is passed back to callback if it was provided.
 * Also all responses and events are dispatched to group of dedicated processors.
 */
public class V8CommandProcessor implements V8CommandSender<V8Request, RuntimeException> {
  /**
   * A callback to handle V8 debugger responses.
   */
  public interface V8HandlerCallback extends BaseCommandProcessor.Callback<CommandResponse> {
    /**
     * This method is invoked when a debugger command result has become
     * available.
     *
     * @param response from the V8 debugger
     */
    void messageReceived(CommandResponse response);

    /**
     * This method is invoked when a debugger command has failed.
     *
     * @param message containing the failure reason
     */
    void failure(String message);
  }

  /** The class logger. */
  private static final Logger LOGGER = Logger.getLogger(V8CommandProcessor.class.getName());

  private final V8CommandOutput messageOutput;

  private final DefaultResponseHandler defaultResponseHandler;

  private final DebugSession debugSession;

  private final BaseCommandProcessor<Request, IncomingMessage, CommandResponse>
      baseCommandProcessor;


  public V8CommandProcessor(V8CommandOutput messageOutput,
      DefaultResponseHandler defaultResponseHandler, DebugSession debugSession) {
    this.messageOutput = messageOutput;
    this.defaultResponseHandler = defaultResponseHandler;
    this.debugSession = debugSession;
    baseCommandProcessor = new BaseCommandProcessor<Request, IncomingMessage, CommandResponse>(new V8MessageHandler());
  }

  @Override
  public RelayOk sendV8CommandAsync(V8Request message, boolean isImmediate, V8HandlerCallback v8HandlerCallback, SyncCallback syncCallback) {
    return baseCommandProcessor.send(message, isImmediate, v8HandlerCallback, syncCallback);
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

  public void processIncomingJson(JsonReader jsonReader) {
    IncomingMessage response;
    try {
      response = ProtocolService.PROTOCOL_READER.parseIncomingMessage(jsonReader);
    }
    catch (IOException e) {
      LOGGER.log(Level.SEVERE, "JSON message does not conform to the protocol", e);
      return;
    }
    baseCommandProcessor.processIncoming(response);
  }

  public void processEos() {
    baseCommandProcessor.processEos();
  }

  private class V8MessageHandler extends MessageHandler<IncomingMessage, CommandResponse> {
    public void send(Request message, boolean isImmediate) {
      messageOutput.send(message, isImmediate);
    }

    public CommandResponse readIfHasSequence(IncomingMessage incoming) {
      return incoming.type() == MessageType.RESPONSE ? incoming.asCommandResponse() : null;
    }

    public int getSequence(CommandResponse incomingWithSeq) {
      return incomingWithSeq.requestSeq();
    }

    public void acceptNonSequence(IncomingMessage incoming) {
      defaultResponseHandler.handleResponseWithHandler(incoming);
    }

    public void reportVmStatus(String currentRequest, int numberOfEnqueued) {
      DebugEventListener.VmStatusListener statusListener = debugSession.getDebugEventListener().getVmStatusListener();
      if (statusListener == null) {
        return;
      }
    }
  }

  private static final RelayOk DISPATCH_THREAD_PROMISES_TO_CALL = new RelayOk() {};
}