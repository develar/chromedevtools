// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;

/**
 * Represents a "changeBreakpoint" V8 request message.
 */
public class ChangeBreakpointMessage extends ContextlessDebuggerMessage {

  /**
   * @param breakpoint id in V8
   * @param enabled nullable initial enabled state. Default is true
   * @param condition nullable string with break point condition
   * @param ignoreCount nullable number specifying the number of break point hits to ignore.
   *        Default is 0
   */
  public ChangeBreakpointMessage(long breakpoint, Boolean enabled, String condition, Integer ignoreCount) {
    super(DebuggerCommand.CHANGEBREAKPOINT.value);
    writeLong("breakpoint", breakpoint);
    writeBoolean("enabled", enabled);
    putNullableArgument("condition", condition);
    writeInt("ignoreCount", ignoreCount);
  }

  public ChangeBreakpointMessage(Long breakpoint, Boolean enabled,
      String condition) {
    super(DebuggerCommand.CHANGEBREAKPOINT.value);
    writeLong("breakpoint", breakpoint);
    writeBoolean("enabled", enabled);
    putNullableArgument("condition", condition);
  }

  public ChangeBreakpointMessage(Long breakpoint, int ignoreCount) {
    super(DebuggerCommand.CHANGEBREAKPOINT.value);
    writeLong("breakpoint", breakpoint);
    writeInt("ignoreCount", ignoreCount);
  }
}
