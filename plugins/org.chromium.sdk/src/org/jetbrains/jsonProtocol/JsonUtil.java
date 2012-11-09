package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonReader;

public class JsonUtil {
  public static JsonReader createReader(String string) {
    return new JsonReader(new StringReader(string));
  }
}