package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonReaderEx;

public abstract class ObjectFactory<T> {
  public abstract T read(JsonReaderEx reader);
}
