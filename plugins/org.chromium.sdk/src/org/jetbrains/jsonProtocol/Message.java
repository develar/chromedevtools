package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import gnu.trove.TLongArrayList;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Message {
  private static final long[] EMPTY_LONG_ARRAY = {};
  private static final Field JSON_READER_POSITION_FIELD;
  private static final Field JSON_READER_IN_FIELD;

  static {
    try {
      JSON_READER_POSITION_FIELD = JsonReader.class.getField("pos");
      JSON_READER_IN_FIELD = JsonReader.class.getField("in");

      JSON_READER_POSITION_FIELD.setAccessible(true);
      JSON_READER_IN_FIELD.setAccessible(true);
    }
    catch (NoSuchFieldException e) {
      throw new RuntimeException(e);
    }
  }

  private static void checkIsNull(JsonReader reader, String fieldName) throws IOException {
    if (reader.peek() == JsonToken.NULL) {
      throw new IOException("Field is not optional " + fieldName);
    }
  }

  protected static String readString(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    return reader.nextString();
  }

  protected static String readNullableString(JsonReader reader) throws IOException {
    return reader.peek() == JsonToken.NULL ? null : reader.nextString();
  }

  protected static boolean readBoolean(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    return reader.nextBoolean();
  }

  protected static boolean readNullableBoolean(JsonReader reader) throws IOException {
    //noinspection SimplifiableConditionalExpression
    return reader.peek() == JsonToken.NULL ? false : reader.nextBoolean();
  }

  protected static int readInt(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    return reader.nextInt();
  }

  protected static long readNullableInt(JsonReader reader) throws IOException {
    return reader.peek() == JsonToken.NULL ? -1 : reader.nextInt();
  }

  protected static long readLong(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    return reader.nextLong();
  }

  protected static long readNullableLong(JsonReader reader) throws IOException {
    return reader.peek() == JsonToken.NULL ? -1 : reader.nextLong();
  }

  protected static <T extends Enum<T>> T readEnum(JsonReader reader, String fieldName, Class<T> enumClass) throws IOException {
    checkIsNull(reader, fieldName);
    return Enum.valueOf(enumClass, reader.nextString());
  }

  protected static <T extends Enum<T>> T readNullableEnum(JsonReader reader, Class<T> enumClass) throws IOException {
    return reader.peek() == JsonToken.NULL ? null : Enum.valueOf(enumClass, reader.nextString());
  }

  protected static <T> List<T> readObjectArray(JsonReader reader, ObjectFactory<T> factory, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    reader.beginArray();
    if (!reader.hasNext()) {
      reader.endArray();
      return Collections.emptyList();
    }

    List<T> result = new ArrayList<T>();
    do {
      result.add(factory.read(reader));
    }
    while (reader.hasNext());
    reader.endArray();
    return result;
  }

  protected static long[] readLongArray(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    reader.beginArray();
    if (!reader.hasNext()) {
      reader.endArray();
      return EMPTY_LONG_ARRAY;
    }

    TLongArrayList result = new TLongArrayList();
    do {
      result.add(reader.nextLong());
    }
    while (reader.hasNext());
    reader.endArray();
    return result.toNativeArray();
  }

  protected static Reader createValueReadeer(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    try {
      int start = JSON_READER_POSITION_FIELD.getInt(reader);
      reader.skipValue();
      int end = JSON_READER_POSITION_FIELD.getInt(reader);
      return ((StringReader)JSON_READER_IN_FIELD.get(reader)).subReader(start, end);
    }
    catch (IllegalAccessException e) {
      throw new IOException(e);
    }
  }
}
