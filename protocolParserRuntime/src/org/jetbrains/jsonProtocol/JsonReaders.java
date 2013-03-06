package org.jetbrains.jsonProtocol;

import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import gnu.trove.THashMap;
import gnu.trove.TIntArrayList;
import gnu.trove.TLongArrayList;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class JsonReaders {
  private static final long[] EMPTY_LONG_ARRAY = {};
  private static final int[] EMPTY_INT_ARRAY = {};
  private static final Field JSON_READER_POSITION_FIELD;
  private static final Field JSON_READER_IN_FIELD;

  static {
    try {
      JSON_READER_POSITION_FIELD = JsonReader.class.getDeclaredField("pos");
      JSON_READER_IN_FIELD = JsonReader.class.getDeclaredField("in");

      JSON_READER_POSITION_FIELD.setAccessible(true);
      JSON_READER_IN_FIELD.setAccessible(true);
    }
    catch (NoSuchFieldException e) {
      throw new RuntimeException(e);
    }
  }

  private JsonReaders() {
  }

  private static void checkIsNull(JsonReader reader, String fieldName) throws IOException {
    if (reader.peek() == JsonToken.NULL) {
      throw new IOException("Field is not optional" + (fieldName == null ? "" : (" " + fieldName)));
    }
  }

  public static String readString(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    return reader.nextString();
  }

  public static String readNullableString(JsonReader reader) throws IOException {
    return reader.peek() == JsonToken.NULL ? null : reader.nextString();
  }

  public static boolean readBoolean(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    return reader.nextBoolean();
  }

  public static boolean readNullableBoolean(JsonReader reader) throws IOException {
    //noinspection SimplifiableConditionalExpression
    return reader.peek() == JsonToken.NULL ? false : reader.nextBoolean();
  }

  public static int readInt(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    return reader.nextInt();
  }

  public static long readNullableInt(JsonReader reader) throws IOException {
    return reader.peek() == JsonToken.NULL ? -1 : reader.nextInt();
  }

  public static long readLong(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    return reader.nextLong();
  }

  public static double readDouble(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    return reader.nextDouble();
  }

  public static long readNullableLong(JsonReader reader) throws IOException {
    return reader.peek() == JsonToken.NULL ? -1 : reader.nextLong();
  }

  public static <T extends Enum<T>> T readEnum(JsonReader reader, String fieldName, Class<T> enumClass) throws IOException {
    checkIsNull(reader, fieldName);
    return Enum.valueOf(enumClass, reader.nextString());
  }

  public static <T extends Enum<T>> T readNullableEnum(JsonReader reader, Class<T> enumClass) throws IOException {
    return reader.peek() == JsonToken.NULL ? null : Enum.valueOf(enumClass, reader.nextString());
  }

  public static <T> List<T> readObjectArray(JsonReader reader, String fieldName, ObjectFactory<T> factory) throws IOException {
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

  public static Map readMap(JsonReader reader, String fieldName) throws IOException {
    checkIsNull(reader, fieldName);
    reader.beginObject();
    if (!reader.hasNext()) {
      reader.endObject();
      return Collections.emptyMap();
    }

    return nextObject(reader);
  }

  public static Object read(JsonReader reader) throws IOException {
    switch (reader.peek()) {
      case BEGIN_ARRAY:
        return nextList(reader);

      case BEGIN_OBJECT:
        reader.beginObject();
        return nextObject(reader);

      case STRING:
        return reader.nextString();

      case NUMBER:
        return reader.nextDouble();

      case BOOLEAN:
        return reader.nextBoolean();

      case NULL:
        reader.nextNull();
        return null;

      default: throw new IllegalStateException();
    }
  }

  public static Map<String, Object> nextObject(JsonReader reader) throws IOException {
    Map<String, Object> map = new THashMap<String, Object>();
    while (reader.hasNext()) {
      map.put(reader.nextName(), read(reader));
    }
    reader.endObject();
    return map;
  }

  public static <T> List<T> nextList(JsonReader reader) throws IOException {
    reader.beginArray();
    if (!reader.hasNext()) {
      reader.endArray();
      return Collections.emptyList();
    }

    List<T> list = new ArrayList<T>();
    do {
      //noinspection unchecked
      list.add((T)read(reader));
    }
    while (reader.hasNext());
    reader.endArray();
    return list;
  }

  public static long[] readLongArray(JsonReader reader) throws IOException {
    checkIsNull(reader, null);
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

  public static int[] readIntArray(JsonReader reader) throws IOException {
    checkIsNull(reader, null);
    reader.beginArray();
    if (!reader.hasNext()) {
      reader.endArray();
      return EMPTY_INT_ARRAY;
    }

    TIntArrayList result = new TIntArrayList();
    do {
      result.add(reader.nextInt());
    }
    while (reader.hasNext());
    reader.endArray();
    return result.toNativeArray();
  }

  public static List<StringIntPair> readIntStringPairs(JsonReader reader) throws IOException {
    checkIsNull(reader, null);
    reader.beginArray();
    if (!reader.hasNext()) {
      reader.endArray();
      return Collections.emptyList();
    }

    List<StringIntPair> result = new ArrayList<StringIntPair>();
    do {
      reader.beginArray();
      result.add(new StringIntPair(reader.nextInt(), reader.nextString()));
      reader.endArray();
    }
    while (reader.hasNext());
    reader.endArray();
    return result;
  }

  public static Reader createValueReader(JsonReader reader) {
    try {
      int start = JSON_READER_POSITION_FIELD.getInt(reader);
      reader.skipValue();
      int end = JSON_READER_POSITION_FIELD.getInt(reader);
      return ((StringReader)JSON_READER_IN_FIELD.get(reader)).subReader(start, end);
    }
    catch (IllegalAccessException e) {
      throw new JsonParseException(e);
    }
    catch (IOException e) {
      throw new JsonParseException(e);
    }
  }

  public static void skipValue(String name, JsonReader reader) throws IOException {
    System.err.append("Unknown field ").append(name).append(" ").append(reader.toString()).append('\n');
    reader.skipValue();
  }

  public static JsonReader createReader(String string) {
    return new JsonReader(new StringReader(string));
  }
}
