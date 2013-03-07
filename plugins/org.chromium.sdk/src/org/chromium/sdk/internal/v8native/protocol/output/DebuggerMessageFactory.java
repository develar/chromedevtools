// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import org.chromium.sdk.Breakpoint;
import org.chromium.sdk.DebugContext.StepAction;
import org.jetbrains.jsonProtocol.StringIntPair;

import java.util.List;

/**
 * A factory for {@link V8Request}s. Static methods are used to construct
 * commands to be sent to the remote V8 debugger.
 */
public class DebuggerMessageFactory {

  public static V8Request backtrace(Integer fromFrame, Integer toFrame,
      boolean compactFormat) {
    return new BacktraceMessage(fromFrame, toFrame, compactFormat);
  }

  public static V8Request goOn(StepAction stepAction, Integer stepCount) {
    return new ContinueMessage(stepAction, stepCount);
  }

  public static V8Request evaluate(String expression, int frame, boolean disableBreak, List<StringIntPair> additionalContext) {
    return new EvaluateMessage(expression, frame, disableBreak, additionalContext);
  }

  public static V8Request frame(Integer frameNumber) {
    return new FrameMessage(frameNumber);
  }

  public static ContextlessDebuggerMessage scripts(Integer types, Boolean includeScripts) {
    return new ScriptsMessage(types, includeScripts);
  }

  public static ContextlessDebuggerMessage scripts(long[] ids, Boolean includeScripts) {
    return new ScriptsMessage(ids, includeScripts);
  }

  public static ContextlessDebuggerMessage source(Integer frame, Integer fromLine, Integer toLine) {
    return new SourceMessage(frame, fromLine, toLine);
  }

  public static ContextlessDebuggerMessage setBreakpoint(Breakpoint.Target target,
      Integer line, Integer column, Boolean enabled, String condition, Integer ignoreCount) {
    return new SetBreakpointMessage(target, line, column, enabled, condition, ignoreCount);
  }

  public static ContextlessDebuggerMessage clearBreakpoint(long id) {
    return new ClearBreakpointMessage(id);
  }

  public static V8Request lookup(long[] refs, Boolean inlineRefs) {
    return new LookupMessage(refs, inlineRefs);
  }

  public static ContextlessDebuggerMessage suspend() {
    return new SuspendMessage();
  }

  /**
   * A generic 'scope' message parameter that refers to the scope host.
   * It is either a stack frame or a function.
   */
  public static abstract class ScopeHostParameter {
    abstract V8Request create(int scopeNumber);

    public static ScopeHostParameter forFrame(final int frameNumber) {
      return new ScopeHostParameter() {
        @Override
        V8Request create(int scopeNumber) {
          return new ScopeMessage(scopeNumber, frameNumber, null);
        }
      };
    }

    public static ScopeHostParameter forFunction(final long functionHandle) {
      return new ScopeHostParameter() {
        @Override
        V8Request create(int scopeNumber) {
          return new ScopeMessage(scopeNumber, null, functionHandle);
        }
      };
    }
  }

  public static V8Request scope(int scopeNumber, ScopeHostParameter hostParameter) {
    return hostParameter.create(scopeNumber);
  }
}
