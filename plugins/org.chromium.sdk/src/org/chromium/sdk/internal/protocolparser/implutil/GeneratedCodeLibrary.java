// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.implutil;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A small library of classes and methods used from generated parser code.
 */
public class GeneratedCodeLibrary {
  public abstract static class AbstractType {
    public abstract Object parseJson(JSONObject json) throws IOException;
    public abstract Object parseAnything(Object object) throws IOException;
  }

  public abstract static class ObjectFactory<T extends JsonValueBase> {
    public abstract T read(JsonReader reader) throws IOException;
  }

  public abstract static class JsonValueBase {
    protected final JsonReader reader;

    protected JsonValueBase(Object reader) throws IOException {
      this.reader = (JsonReader)reader;
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

    protected static <T extends JsonValueBase> List<T> readObjectArray(JsonReader reader, ObjectFactory<T> factory, String fieldName) throws IOException {
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
  }

  public static class ObjectValueBase {
    protected final Object underlying;

    protected ObjectValueBase (Object underlying) {
      this.underlying = underlying;
    }
  }
}