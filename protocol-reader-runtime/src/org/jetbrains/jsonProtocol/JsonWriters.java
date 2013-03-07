package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public final class JsonWriters {
  private static final String[] REPLACEMENT_CHARS;
  public static final Method JSON_WRITE_DEFERED_NAME;

  static {
    REPLACEMENT_CHARS = new String[128];
    for (int i = 0; i <= 0x1f; i++) {
      REPLACEMENT_CHARS[i] = String.format("\\u%04x", (int)i);
    }
    REPLACEMENT_CHARS['"'] = "\\\"";
    REPLACEMENT_CHARS['\\'] = "\\\\";
    REPLACEMENT_CHARS['\t'] = "\\t";
    REPLACEMENT_CHARS['\b'] = "\\b";
    REPLACEMENT_CHARS['\n'] = "\\n";
    REPLACEMENT_CHARS['\r'] = "\\r";
    REPLACEMENT_CHARS['\f'] = "\\f";

    try {
      JSON_WRITE_DEFERED_NAME = JsonWriter.class.getDeclaredMethod("writeDeferredName");
      JSON_WRITE_DEFERED_NAME.setAccessible(true);
    }
    catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }

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

  public static void escapeString(StringBuilder out, CharSequence value) {
    out.append('"');
    int last = 0;
    int length = value.length();
    for (int i = 0; i < length; i++) {
      char c = value.charAt(i);
      String replacement;
      if (c < 128) {
        replacement = REPLACEMENT_CHARS[c];
        if (replacement == null) {
          continue;
        }
      }
      else if (c == '\u2028') {
        replacement = "\\u2028";
      }
      else if (c == '\u2029') {
        replacement = "\\u2029";
      }
      else {
        continue;
      }
      if (last < i) {
        out.append(value, last, i - last);
      }
      out.append(replacement);
      last = i + 1;
    }
    if (last < length) {
      out.append(value, last, length - last);
    }
    out.append('"');
  }
}
