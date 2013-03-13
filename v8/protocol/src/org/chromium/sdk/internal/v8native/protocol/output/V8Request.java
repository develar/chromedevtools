// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

/**
 * Represents a generic V8 request message (so that it can serialize itself into JSON.)
 */
public abstract class V8Request extends org.jetbrains.v8.protocol.V8Request {
  private final String command;

  public V8Request(String command) {
    super(command);
    this.command = command;
  }

  @Override
  public String getMethodName() {
    return command;
  }
}