package org.jetbrains.jsonProtocol;

import java.io.Reader;

public abstract class LazyReadMessage extends Message {
  protected Reader inputReader;
}
