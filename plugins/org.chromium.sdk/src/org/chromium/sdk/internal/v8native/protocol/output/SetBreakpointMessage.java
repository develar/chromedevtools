// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import org.chromium.sdk.Breakpoint;
import org.chromium.sdk.Breakpoint.Target;
import org.chromium.sdk.internal.v8native.BreakpointImpl;
import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;
import org.chromium.sdk.internal.v8native.ScriptManager;

/**
 * Represents a "setbreakpoint" V8 request message.
 */
public class SetBreakpointMessage extends ContextlessDebuggerMessage {

  /**
   * @param target function expression, script identification, or handle decimal number
   * @param line in the script or function
   * @param column of the target start within the line
   * @param enabled whether the breakpoint is enabled initially. Nullable, default is true
   * @param condition nullable string with breakpoint condition
   * @param ignoreCount nullable number specifying the amount of break point hits to ignore.
   *        Default is 0
   */
  public SetBreakpointMessage(Breakpoint.Target target, int line, int column, boolean enabled, String condition, int ignoreCount) {
    super(DebuggerCommand.SETBREAKPOINT.value);
    put("type", target.accept(GET_TYPE_VISITOR));

    Object targetValue = target.accept(GET_TARGET_VISITOR);
    if (targetValue instanceof Long) {
      put("target", ((Long)targetValue));
    }
    else {
      put("target", ((String)targetValue));
    }
    put("line", line);
    put("column", column);
    put("enabled", enabled);
    put("condition", condition);
    put("ignoreCount", ignoreCount);
  }

  private static final BreakpointImpl.TargetExtendedVisitor<String> GET_TYPE_VISITOR =
      new BreakpointImpl.TargetExtendedVisitor<String>() {
    @Override public String visitFunction(String expression) {
      return "function";
    }
    @Override public String visitScriptName(String scriptName) {
      return "script";
    }
    @Override public String visitScriptId(Object scriptId) {
      return "scriptId";
    }
    @Override public String visitRegExp(String regExp) {
      return "scriptRegExp";
    }
    @Override public String visitUnknown(Target target) {
      throw new IllegalArgumentException();
    }
  };

  private static final BreakpointImpl.TargetExtendedVisitor<Object> GET_TARGET_VISITOR =
      new BreakpointImpl.TargetExtendedVisitor<Object>() {
    @Override public Object visitFunction(String expression) {
      return expression;
    }
    @Override public Object visitScriptName(String scriptName) {
      return scriptName;
    }
    @Override public Object visitScriptId(Object scriptIdObj) {
      return ScriptManager.convertAlienScriptId(scriptIdObj);
    }
    @Override public Object visitRegExp(String regExp) {
      return regExp;
    }
    @Override public Object visitUnknown(Target target) {
      throw new IllegalArgumentException();
    }
  };
}
