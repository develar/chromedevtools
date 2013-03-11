package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonReaderEx;
import com.google.gson.stream.JsonToken;
import gnu.trove.THashMap;
import gnu.trove.TIntArrayList;
import gnu.trove.TLongArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class JsonReaders {
  private static final long[] EMPTY_LONG_ARRAY = {};
  private static final int[] EMPTY_INT_ARRAY = {};

  private JsonReaders() {
  }

  private static void checkIsNull(JsonReaderEx reader, String fieldName) {
    if (reader.peek() == JsonToken.NULL) {
      throw new RuntimeException("Field is not optional" + (fieldName == null ? "" : (" " + fieldName)));
    }
  }

  public static String readString(JsonReaderEx reader, String fieldName) {
    checkIsNull(reader, fieldName);
    return reader.nextString();
  }

  public static String readNullableString(JsonReaderEx reader) {
    return reader.peek() == JsonToken.NULL ? null : reader.nextString();
  }

  public static boolean readBoolean(JsonReaderEx reader, String fieldName) {
    checkIsNull(reader, fieldName);
    return reader.nextBoolean();
  }

  public static boolean readNullableBoolean(JsonReaderEx reader) {
    //noinspection SimplifiableConditionalExpression
    return reader.peek() == JsonToken.NULL ? false : reader.nextBoolean();
  }

  public static int readInt(JsonReaderEx reader, String fieldName) {
    checkIsNull(reader, fieldName);
    return reader.nextInt();
  }

  public static long readNullableInt(JsonReaderEx reader) {
    return reader.peek() == JsonToken.NULL ? -1 : reader.nextInt();
  }

  public static long readLong(JsonReaderEx reader, String fieldName) {
    checkIsNull(reader, fieldName);
    return reader.nextLong();
  }

  public static double readDouble(JsonReaderEx reader, String fieldName) {
    checkIsNull(reader, fieldName);
    return reader.nextDouble();
  }

  public static long readNullableLong(JsonReaderEx reader) {
    return reader.peek() == JsonToken.NULL ? -1 : reader.nextLong();
  }

  public static <T extends Enum<T>> T readEnum(JsonReaderEx reader, String fieldName, Class<T> enumClass) {
    checkIsNull(reader, fieldName);
    return Enum.valueOf(enumClass, readEnumName(reader));
  }

  public static String convertRawEnumName(String enumValue) {
    StringBuilder builder = new StringBuilder(enumValue.length() + 4);
    boolean prevIsLowerCase = false;
    for (int i = 0; i < enumValue.length(); i++) {
      char c = enumValue.charAt(i);
      if (c == '-') {
        builder.append('_');
        continue;
      }

      if (Character.isUpperCase(c)) {
        // second check handle "CSPViolation" (transform to CSP_VIOLATION)
        if (prevIsLowerCase || ((i + 1) < enumValue.length() && Character.isLowerCase(enumValue.charAt(i + 1)))) {
          builder.append('_');
        }
        builder.append(c);
      }
      else {
        builder.append(Character.toUpperCase(c));
        prevIsLowerCase = true;
      }
    }
    return builder.toString();
  }

  private static String readEnumName(JsonReaderEx reader) {
    return convertRawEnumName(reader.nextString());
  }

  public static <T extends Enum<T>> T readNullableEnum(JsonReaderEx reader, Class<T> enumClass) {
    return reader.peek() == JsonToken.NULL ? null : Enum.valueOf(enumClass, readEnumName(reader));
  }

  public static <T> List<T> readObjectArray(JsonReaderEx reader, String fieldName, ObjectFactory<T> factory, boolean nullable) {
    if (reader.peek() == JsonToken.NULL) {
      if (nullable) {
        return null;
      }
      else {
        checkIsNull(reader, fieldName);
      }
    }

    reader.beginArray();
    if (!reader.hasNext()) {
      reader.endArray();
      if (nullable) {
        return null;
      }
      else {
        return Collections.emptyList();
      }
    }

    List<T> result = new ArrayList<T>();
    do {
      result.add(factory.read(reader));
    }
    while (reader.hasNext());
    reader.endArray();
    return result;
  }

  public static Map<?, ?> readMap(JsonReaderEx reader, String fieldName) {
    checkIsNull(reader, fieldName);
    reader.beginObject();
    if (!reader.hasNext()) {
      reader.endObject();
      return Collections.emptyMap();
    }
    return nextObject(reader);
  }

  public static Object read(JsonReaderEx reader) {
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

  public static Map<String, Object> nextObject(JsonReaderEx reader) {
    Map<String, Object> map = new THashMap<String, Object>();
    while (reader.hasNext()) {
      map.put(reader.nextName(), read(reader));
    }
    reader.endObject();
    return map;
  }

  public static <T> List<T> nextList(JsonReaderEx reader) {
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

  public static long[] readLongArray(JsonReaderEx reader) {
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

  public static int[] readIntArray(JsonReaderEx reader) {
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

  public static List<StringIntPair> readIntStringPairs(JsonReaderEx reader) {
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

  public static JsonReaderEx createReader(CharSequence string) {
    return new JsonReaderEx(string);
  }

  public static boolean findBooleanField(String name, JsonReaderEx reader) {
    reader.beginObject();
    while (reader.hasNext()) {
      if (reader.nextName().equals(name)) {
        return reader.nextBoolean();
      }
      else {
        reader.skipValue();
      }
    }
    return false;
  }
}
