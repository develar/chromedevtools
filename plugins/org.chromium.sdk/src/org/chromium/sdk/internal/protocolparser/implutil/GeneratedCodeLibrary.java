// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.implutil;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * A small library of classes and methods used from generated parser code.
 */
public class GeneratedCodeLibrary {
  public abstract static class AbstractType {
    public abstract Object parseJson(JSONObject json) throws JsonProtocolParseException;
    public abstract Object parseAnything(Object object) throws JsonProtocolParseException;
  }

  public static class JsonValueBase {
    protected final JsonReader reader;

    protected JsonValueBase(Object reader) throws IOException {
      this.reader = (JsonReader)reader;
    }

    protected static void throwFieldIsNotOptional(String fieldName) throws IOException {
      throw new IOException("Field is not optional " + fieldName);
    }
  }

  public static class ObjectValueBase {
    protected final Object underlying;

    protected ObjectValueBase (Object underlying) {
      this.underlying = underlying;
    }
  }
}