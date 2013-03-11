package org.jetbrains.rpc;

import org.chromium.sdk.internal.BaseCommandProcessor;
import org.jetbrains.jsonProtocol.Request;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class MessageHandler<INCOMING, INCOMING_WITH_SEQ> implements BaseCommandProcessor.Handler<Request, INCOMING, INCOMING_WITH_SEQ> {
  private final AtomicInteger currentSequence = new AtomicInteger(0);

  @Override
  public int getUpdatedSequence(Request message) {
    int id = currentSequence.incrementAndGet();
    message.finalize(id);
    return id;
  }

  @Override
  public String getMethodName(Request message) {
    return message.getMethodName();
  }
}