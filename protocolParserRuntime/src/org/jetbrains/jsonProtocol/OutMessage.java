package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public abstract class OutMessage {
  private static final Method JSON_WRITE_DEFERED_NAME;

  private final StringWriter stringWriter = new StringWriter();
  protected final JsonWriter writer = new JsonWriter(stringWriter);

  protected boolean argumentsObjectStarted;

  static {
      try {
        JSON_WRITE_DEFERED_NAME = JsonWriter.class.getDeclaredMethod("writeDeferredName");
        JSON_WRITE_DEFERED_NAME.setAccessible(true);
      }
      catch (NoSuchMethodException e) {
        throw new RuntimeException(e);
      }
    }

  public  String getCommand() {
    throw new AbstractMethodError();
  }

  protected final void put(String name, Enum<?> value) {
    try {
      addArgumentsName();
      writer.name(name).value(value.toString());
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void put(String name, int value) {
    try {
      addArgumentsName();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void put(String name, long[] value) {
    try {
      addArgumentsName();
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

  protected final <E extends OutMessage> void put(String name, List<E> value) {
    try {
      addArgumentsName();
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

  protected final void put(String name, List<String> value) {
    try {
      addArgumentsName();
      writer.name(name);
      writer.beginArray();
      for (String item : value) {
        writer.value(item);
      }
      writer.endArray();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void put(String name, OutMessage value) {
    try {
      addArgumentsName();
      writer.name(name);
      JSON_WRITE_DEFERED_NAME.invoke(writer);
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

  protected final void put(String name, long value) {
    try {
      addArgumentsName();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void put(String name, double value) {
    try {
      addArgumentsName();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void doPutArgument(String name, String value) {
    try {
      addArgumentsName();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void put(String name, boolean value) {
    try {
      addArgumentsName();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected void addArgumentsName() throws IOException {
    if (!argumentsObjectStarted) {
      argumentsObjectStarted = true;
      writer.name("arguments");
      writer.beginObject();
    }
  }

  protected final void put(String name, String value) {
    if (value != null) {
      doPutArgument(name, value);
    }
  }

  protected final void putNullableArgument(String key, String value) {
    doPutArgument(key, value);
  }

  public CharSequence toJson() {
    try {
      if (argumentsObjectStarted) {
        writer.endObject();
      }
      writer.close();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
    return stringWriter.getBuffer();
  }
}
