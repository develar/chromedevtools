package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.List;

public final class JsonWriters {
  private JsonWriters() {
  }

  public static void writeStringList(JsonWriter writer, String name, List<String> value) throws IOException {
    writer.name(name);
    writer.beginArray();
    for (String item : value) {
      writer.value(item);
    }
    writer.endArray();
  }
}
