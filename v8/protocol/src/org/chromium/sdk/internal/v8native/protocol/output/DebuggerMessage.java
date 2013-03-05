// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import org.jetbrains.jsonProtocol.OutMessage;

import java.io.IOException;

/**
 * Represents a generic V8 request message (so that it can serialize itself into JSON.)
 */
public class DebuggerMessage extends OutMessage {
  private final int sequence;
  private final String command;
  private boolean argumentsObjectStarted;

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

  @Override
  public String getCommand() {
    return command;
  }

  protected final void addArgumentsName() throws IOException {
    if (!argumentsObjectStarted) {
      argumentsObjectStarted = true;
      writer.name("arguments");
      writer.beginObject();
    }
  }

  public CharSequence toJson() {
    try {
      if (argumentsObjectStarted) {
        writer.endObject();
      }
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
    return super.toJson();
  }
}
