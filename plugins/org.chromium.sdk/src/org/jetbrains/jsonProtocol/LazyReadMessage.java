package org.jetbrains.jsonProtocol;

import java.io.Reader;

public abstract class LazyReadMessage extends Message {
  private final Reader reader;

  protected LazyReadMessage(Reader reader) {
    this.reader = reader;
  }
}
