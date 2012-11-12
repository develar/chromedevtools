// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Represents a generic JSONStreamAware V8 request message (so that it can
 * serialize itself into JSON.)
 */
public class DebuggerMessage {
  private final int sequence;
  private final String command;
  private boolean argumentsObjectStarted;

  private final StringWriter stringWriter = new StringWriter();
  protected final JsonWriter writer = new JsonWriter(stringWriter);

  public DebuggerMessage(String command) {
    sequence = SeqGenerator.getInstance().next();
    this.command = command;

    try {
      writer.beginObject();
      writer.name("seq").value(sequence);
      writer.name("type").value(V8MessageType.REQUEST.value);
      writer.name("command").value(command);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public Integer getSeq() {
    return sequence;
  }

  public String getType() {
    return V8MessageType.REQUEST.value;
  }

  public String getCommand() {
    return command;
  }

  protected final void putArgument(String name, int value) {
    try {
      addArgumentsName();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void putArgument(String name, long[] value) {
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

  protected final void putArgument(String name, long value) {
    try {
      addArgumentsName();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void addArgumentsName() throws IOException {
    if (!argumentsObjectStarted) {
      argumentsObjectStarted = true;
      writer.name("arguments");
      writer.beginObject();
    }
  }

  protected final void putArgument(String name, boolean value) {
    try {
      addArgumentsName();
      writer.name(name).value(value);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected final void putArgument(String name, String value) {
    if (value != null) {
      doPutArgument(name, value);
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

  protected final void putNullableArgument(String key, String value) {
    doPutArgument(key, value);
  }

  public CharSequence toJson() {
    try {
      if (argumentsObjectStarted) {
        writer.endObject();
      }
      writer.endObject();
      writer.close();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
    return stringWriter.getBuffer();
  }
}
