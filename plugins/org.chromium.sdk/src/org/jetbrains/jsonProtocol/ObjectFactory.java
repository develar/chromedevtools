package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonReader;

import java.io.IOException;

public abstract class ObjectFactory<T> {
  public abstract T read(JsonReader reader) throws IOException;
}
