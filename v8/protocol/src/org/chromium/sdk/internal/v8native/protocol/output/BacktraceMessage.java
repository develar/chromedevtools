// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;

/**
 * Represents a "backtrace" V8 request message.
 */
public class BacktraceMessage extends V8Request {
  /**
   * @param fromFrame nullable frame range start (0 by default)
   * @param toFrame nullable frame range end (last frame by default)
   * @param inlineRefs whether to inline object refs
   */
  public BacktraceMessage(int fromFrame, int toFrame, boolean inlineRefs) {
    super(DebuggerCommand.BACKTRACE.value);

    writeInt("fromFrame", fromFrame);
    writeInt("toFrame", toFrame);
    if (inlineRefs) {
      writeBoolean("inlineRefs", inlineRefs);
    }
  }
}
