package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public abstract class OutMessage {
  private final StringWriter stringWriter = new StringWriter();
  protected final JsonWriter writer = new JsonWriter(stringWriter);

  protected OutMessage() {
    try {
      writer.beginObject();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected void beginArguments() throws IOException {
  }

  protected final void writeEnum(String name, Enum<?> value) {
    try {
      beginArguments();
      writer.name(name).value(value.toString());
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void writeInt(String name, int value) {
    try {
      beginArguments();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void writeLongArray(String name, long[] value) {
    try {
      beginArguments();
      writer.name(name);
      writer.beginArray();
      for (long v : value) {
        writer.value(v);
      }
      writer.endArray();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final <E extends OutMessage> void writeList(String name, List<E> value) {
    try {
      beginArguments();
      writer.name(name);
      writer.beginArray();
      boolean isNotFirst = false;
      for (E item : value) {
        stringWriter.append(item.stringWriter.getBuffer());
        if (isNotFirst) {
          stringWriter.append(',').append(' ');
        }
        else {
          isNotFirst = true;
        }
      }
      writer.endArray();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void writeStringList(String name, List<String> value) {
    try {
      beginArguments();
      JsonWriters.writeStringList(writer, name, value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void writeMessage(String name, OutMessage value) {
    try {
      beginArguments();
      writer.name(name);
      JsonWriters.JSON_WRITE_DEFERED_NAME.invoke(writer);
      stringWriter.append(':').append(' ').append(value.stringWriter.getBuffer());
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
    catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }
    catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void writeLong(String name, long value) {
    try {
      beginArguments();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void writeDouble(String name, double value) {
    try {
      beginArguments();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void writeBoolean(String name, boolean value) {
    try {
      beginArguments();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void writeString(String name, String value) {
    if (value != null) {
      doPutArgument(name, value);
    }
  }

  protected final void doPutArgument(String name, String value) {
    try {
      beginArguments();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void putNullableArgument(String key, String value) {
    doPutArgument(key, value);
  }

  public final CharSequence toJson() {
    return stringWriter.getBuffer();
  }
}
