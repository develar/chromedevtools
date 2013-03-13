// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.processor;

import org.chromium.sdk.Breakpoint;
import org.chromium.sdk.ExceptionData;
import org.jetbrains.v8.BreakpointManager;
import org.jetbrains.v8.ContextBuilder;
import org.jetbrains.v8.DebugSession;
import org.jetbrains.v8.InternalContext;
import org.chromium.sdk.internal.v8native.protocol.V8Protocol;
import org.chromium.sdk.internal.v8native.protocol.input.BreakEventBody;
import org.chromium.sdk.internal.v8native.protocol.input.EventNotification;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle;
import org.chromium.sdk.internal.v8native.protocol.output.BacktraceMessage;
import org.jetbrains.v8.value.ExceptionDataImpl;
import org.jetbrains.v8.value.ValueLoaderImpl;
import org.jetbrains.v8.value.ValueMirror;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Handles the suspension-related V8 command replies and events.
 */
public class BreakpointProcessor extends V8EventProcessor {

  /** The name of the "exception" object to report as a variable name. */
  private static final String EXCEPTION_NAME = "exception";

  public BreakpointProcessor(DebugSession debugSession) {
    super(debugSession);
  }

  @Override
  public void messageReceived(EventNotification eventMessage) {
    String event = eventMessage.event();
    DebugSession debugSession = getDebugSession();

    ContextBuilder contextBuilder = debugSession.getContextBuilder();
    ContextBuilder.ExpectingBreakEventStep step1 = contextBuilder.buildNewContext();
    InternalContext internalContext = step1.getInternalContext();
    BreakEventBody breakEventBody;
    try {
      breakEventBody = eventMessage.body().asBreakEventBody();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }

    ContextBuilder.ExpectingBacktraceStep step2;
    if (V8Protocol.EVENT_BREAK.key.equals(event)) {
      Collection<Breakpoint> breakpointsHit = getBreakpointsHit(breakEventBody);
      step2 = step1.setContextState(breakpointsHit, null);
    }
    else if (V8Protocol.EVENT_EXCEPTION.key.equals(event)) {
      ExceptionData exception = createException(eventMessage, breakEventBody,
                                                internalContext);
      step2 = step1.setContextState(Collections.<Breakpoint>emptySet(), exception);
    }
    else {
      ContextBuilder.buildSequenceFailure();
      throw new RuntimeException();
    }

    processNextStep(step2);
  }

  public static void processNextStep(ContextBuilder.ExpectingBacktraceStep step2) {
    step2.getInternalContext().sendV8CommandAsync(new BacktraceMessage(-1, -1, true), false, new BacktraceProcessor(step2), null);
  }

  private Collection<Breakpoint> getBreakpointsHit(BreakEventBody breakEventBody) {
    int[] breakpointIdsArray = breakEventBody.breakpoints();
    BreakpointManager breakpointManager = getDebugSession().getBreakpointManager();
    if (breakpointIdsArray == null) {
      // Suspended on step end.
      return Collections.emptySet();
    }
    Collection<Breakpoint> breakpointsHit = new ArrayList<Breakpoint>(breakpointIdsArray.length);
    for (int aBreakpointIdsArray : breakpointIdsArray) {
      Breakpoint existingBp = breakpointManager.getBreakpoint(aBreakpointIdsArray);
      if (existingBp != null) {
        breakpointsHit.add(existingBp);
      }
    }
    return breakpointsHit;
  }

  private static ExceptionData createException(EventNotification response, BreakEventBody body,
                                               InternalContext internalContext) {
    ValueHandle exception = body.exception();
    ValueLoaderImpl valueLoader = internalContext.getValueLoader();
    for (SomeHandle handle : response.refs()) {
      valueLoader.addHandleFromRefs(handle);
    }
    valueLoader.addHandleFromRefs(exception);

    // source column is not exposed ("sourceColumn" in "body")
    String sourceText = body.sourceLineText();
    ValueMirror mirror = valueLoader.addDataToMap(exception);
    return new ExceptionDataImpl(internalContext, mirror, EXCEPTION_NAME, body.uncaught(), sourceText, exception.text());
  }
}
