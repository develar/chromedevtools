package org.jetbrains.rpc;

import org.chromium.sdk.internal.BaseCommandProcessor;
import org.jetbrains.jsonProtocol.RequestImpl;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class MessageHandler<INCOMING, INCOMING_WITH_SEQ> implements BaseCommandProcessor.Handler<RequestImpl, INCOMING, INCOMING_WITH_SEQ> {
  private final AtomicInteger currentSequence = new AtomicInteger(0);

  @Override
  public int getUpdatedSequence(RequestImpl message) {
    int id = currentSequence.incrementAndGet();
    message.finalize(id);
    return id;
  }

  @Override
  public String getMethodName(RequestImpl message) {
    return message.getMethodName();
  }
}