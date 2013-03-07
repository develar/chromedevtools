// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import org.jetbrains.jsonProtocol.Request;

import java.io.IOException;

/**
 * Represents a generic V8 request message (so that it can serialize itself into JSON.)
 */
public class V8Request extends Request {
  private final String command;

  public V8Request(String command) {
    super();

    this.command = command;
    try {
      writer.name("type").value(V8MessageType.REQUEST.value);
      writer.name("command").value(command);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String getMethodName() {
    return command;
  }

  @Override
  protected String getIdKeyName() {
    return "seq";
  }

  @Override
  protected String argumentsKeyName() {
    return "arguments";
  }

  public String getType() {
    return V8MessageType.REQUEST.value;
  }
}