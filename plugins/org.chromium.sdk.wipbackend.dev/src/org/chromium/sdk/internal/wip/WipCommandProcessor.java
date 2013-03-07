// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.wip;

import com.google.gson.stream.JsonReader;
import org.chromium.sdk.DebugEventListener.VmStatusListener;
import org.chromium.sdk.RelayOk;
import org.chromium.sdk.SyncCallback;
import org.chromium.sdk.TabDebugEventListener;
import org.chromium.sdk.internal.BaseCommandProcessor;
import org.chromium.sdk.internal.websocket.WsConnection;
import org.chromium.sdk.util.GenericCallback;
import org.chromium.sdk.wip.WipParserAccess;
import org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData;
import org.chromium.wip.protocol.input.debugger.PausedEventData;
import org.chromium.wip.protocol.input.debugger.ResumedEventData;
import org.chromium.wip.protocol.input.debugger.ScriptParsedEventData;
import org.chromium.wip.protocol.input.page.FrameDetachedEventData;
import org.chromium.wip.protocol.input.page.FrameNavigatedEventData;
import org.jetbrains.jsonProtocol.OutMessage;
import org.jetbrains.wip.protocol.*;
import org.jetbrains.wip.protocol.WipCommandResponse.Success;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Responsible for the basic processing and dispatching all incoming and outgoing messages.
 */
class WipCommandProcessor {
  private static final Logger LOGGER = Logger.getLogger(WipCommandProcessor.class.getName());

  private final WipTabImpl tabImpl;
  private final BaseCommandProcessor<Integer, OutMessage, JsonReader, WipCommandResponse> baseProcessor;

  WipCommandProcessor(WipTabImpl tabImpl, WsConnection wsSocket) {
    this.tabImpl = tabImpl;
    baseProcessor = new BaseCommandProcessor<Integer, OutMessage, JsonReader, WipCommandResponse>(new WipMessageTypeHandler());
  }

  RelayOk sendRaw(OutMessage message, WipCommandCallback callback, SyncCallback syncCallback) {
    return baseProcessor.send(message, false, callback, syncCallback);
  }

  RelayOk send(WipParams params, WipCommandCallback callback, SyncCallback syncCallback) {
    WipRequest request = new WipRequest(params);
    return sendRaw(request, callback, syncCallback);
  }

  /**
   * @param <RESPONSE> type of response expected that is determined by params
   * @param params request parameters that also holds a method name
   * @param callback a callback that accepts method-specific response or null
   * @param syncCallback may be null
   */
  <RESPONSE> RelayOk send(final WipParamsWithResponse<RESPONSE> params,
      final GenericCallback<RESPONSE> callback, SyncCallback syncCallback) {
    WipRequest request = new WipRequest(params);
    WipCommandCallback commandCallback;
    if (callback == null) {
      commandCallback = null;
    }
    else {
      commandCallback = new WipCommandCallback.Default() {
        @Override
        protected void onSuccess(Success success) {
          RESPONSE response;
          try {
            response = params.parseResponse(success.data(), WipParserAccess.get());
          }
          catch (IOException e) {
            throw new RuntimeException(e);
          }
          callback.success(response);
        }

        @Override
        protected void onError(String message) {
          callback.failure(new Exception(message));
        }
      };
    }

    return sendRaw(request, commandCallback, syncCallback);
  }

  void acceptResponse(JsonReader message) {
    baseProcessor.processIncoming(message);
  }

  void processEos() {
    baseProcessor.processEos();
  }

  private void processEvent(JsonReader jsonObject) {
    WipEvent event;
    try {
      event = WipParserAccess.get().parseWipEvent(jsonObject);
    } catch (IOException e) {
      LOGGER.log(Level.SEVERE, "Failed to parse event", e);
      return;
    }
    EVENT_MAP.handleEvent(event, this);
  }

  /**
   * Handles all operations specific to Wip messages.
   */
  private class WipMessageTypeHandler implements BaseCommandProcessor.Handler<Integer, OutMessage, JsonReader, WipCommandResponse> {
    private final AtomicInteger currentSequence = new AtomicInteger(0);

    @Override
    public Integer getUpdatedSeq(OutMessage message) {
      int sequence = currentSequence.addAndGet(1);
      message.put(BasicConstants.Property.ID, sequence);
      return sequence;
    }

    @Override
    public String getCommandName(OutMessage message) {
      return message.getCommand();
    }

    @Override
    public void send(OutMessage message, boolean isImmediate) {
      try {
        tabImpl.getWsSocket().sendTextualMessage(message.toJson());
      }
      catch (IOException e) {
        LOGGER.log(Level.SEVERE, "Failed to send", e);
      }
    }

    @Override
    public WipCommandResponse parseWithSeq(JsonReader incoming) {
      //if (!incoming.containsKey(BasicConstants.Property.ID)) {
      //  return null;
      //}
      try {
        return WipParserAccess.get().parseWipCommandResponse(incoming);
      }
      catch (IOException e) {
        throw new RuntimeException("Failed to parse response", e);
      }
    }

    @Override
    public Integer getSeq(WipCommandResponse incomingWithSeq) {
      Object seqObject = incomingWithSeq.id();
      if (seqObject == null) {
        return null;
      }
      Number number = (Number) seqObject;
      return number.intValue();
    }

    @Override
    public void acceptNonSeq(JsonReader incoming) {
      processEvent(incoming);
    }

    @Override
    public void reportVmStatus(String currentRequest, int numberOfEnqueued) {
      TabDebugEventListener tabEventListener = tabImpl.getDebugListener();
      VmStatusListener vmStatusListener = tabEventListener.getDebugEventListener().getVmStatusListener();
      if (vmStatusListener != null) {
        vmStatusListener.busyStatusChanged(currentRequest, numberOfEnqueued);
      }
    }
  }

  private abstract static class EventHandler<T> {
    abstract void accept(T eventData, WipCommandProcessor commandProcessor);
  }

  private static final EventMap EVENT_MAP;
  static {
    EVENT_MAP = new EventMap();

    EVENT_MAP.add(PausedEventData.TYPE, new EventHandler<PausedEventData>() {
      @Override
      void accept(PausedEventData data, WipCommandProcessor commandProcessor) {
        commandProcessor.tabImpl.getContextBuilder().createContext(data);
      }
    });
    EVENT_MAP.add(ResumedEventData.TYPE, new EventHandler<ResumedEventData>() {
      @Override
      void accept(ResumedEventData event, WipCommandProcessor commandProcessor) {
        commandProcessor.tabImpl.getContextBuilder().onResumeReportedFromRemote(event);
      }
    });
    EVENT_MAP.add(ScriptParsedEventData.TYPE, new EventHandler<ScriptParsedEventData> () {
      @Override
      void accept(ScriptParsedEventData eventData,
          WipCommandProcessor commandProcessor) {
        commandProcessor.tabImpl.getScriptManager().scriptIsReportedParsed(eventData);
      }
    });
    EVENT_MAP.add(BreakpointResolvedEventData.TYPE,
        new EventHandler<BreakpointResolvedEventData> () {
      @Override
      void accept(BreakpointResolvedEventData eventData,
          WipCommandProcessor commandProcessor) {
        commandProcessor.tabImpl.getBreakpointManager().breakpointReportedResolved(eventData);
      }
    });

    EVENT_MAP.add(FrameNavigatedEventData.TYPE, new EventHandler<FrameNavigatedEventData> () {
      @Override
      void accept(FrameNavigatedEventData eventData,
          WipCommandProcessor commandProcessor) {
        commandProcessor.tabImpl.getFrameManager().frameNavigated(eventData);
      }
    });

    EVENT_MAP.add(FrameDetachedEventData.TYPE, null);
  }

  public RelayOk runInDispatchThread(Runnable runnable, SyncCallback syncCallback) {
    return tabImpl.getWsSocket().runInDispatchThread(runnable, syncCallback);
  }

  private static class EventMap {
    private final Map<String, InternalHandler<?>> map = new HashMap<String, InternalHandler<?>>();

    public <T> void add(WipEventType<T> type, EventHandler<T> eventHandler) {
      InternalHandler<T> internalHandler = new InternalHandler<T>(eventHandler, type);
      map.put(type.getMethodName(), internalHandler);
    }

    public void handleEvent(WipEvent event, WipCommandProcessor commandProcessor) {
      String method = event.method();
      InternalHandler<?> parser = map.get(method);
      if (parser == null) {
        LOGGER.log(Level.INFO, "Unsupported event: " + method);
        return;
      }
      parser.handle(event, commandProcessor);
    }

    private static class InternalHandler<T> {
      private final EventHandler<T> handler;
      private final WipEventType<T> type;

      InternalHandler(EventHandler<T> handler, WipEventType<T> type) {
        this.handler = handler;
        this.type = type;
      }

      public void handle(WipEvent event, WipCommandProcessor commandProcessor) {
        if (handler == null) {
          return;
        }
        WipEvent.Data genericData = event.data();
        T data;
        if (genericData == null) {
          data = null;
        } else {
          try {
            data = type.parse(WipParserAccess.get(), genericData.getDeferredReader());
          } catch (IOException e) {
            throw new RuntimeException(e);
          }
        }
        handler.accept(data, commandProcessor);
      }
    }
  }
}
