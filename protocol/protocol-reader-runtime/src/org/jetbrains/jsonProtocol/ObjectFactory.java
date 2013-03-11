package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonReaderEx;

import java.io.IOException;

public abstract class ObjectFactory<T> {
  public abstract T read(JsonReaderEx reader) throws IOException;
}
