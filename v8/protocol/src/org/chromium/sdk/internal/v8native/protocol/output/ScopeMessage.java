// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;

/**
 * Represents a "scope" request message.
 */
public class ScopeMessage extends V8Request {

  public ScopeMessage(int scopeNumber, Integer frameNumber, Long functionHandle) {
    super(DebuggerCommand.SCOPE.value);
    writeInt("number", scopeNumber);
    if (frameNumber != null) {
      writeInt("frameNumber", frameNumber);
    }
    if (functionHandle != null) {
      writeLong("functionHandle", functionHandle);
    }
    writeBoolean("inlineRefs", true);
  }

}
