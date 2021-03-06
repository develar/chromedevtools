// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.processor;

import org.chromium.sdk.DebugContext;
import org.chromium.sdk.JavascriptVm;
import org.chromium.sdk.Script;
import org.jetbrains.v8.ContextBuilder;
import org.jetbrains.v8.DebugSession;
import org.jetbrains.v8.V8CommandCallback;
import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;
import org.chromium.sdk.internal.v8native.protocol.input.CommandResponse;
import org.chromium.sdk.internal.v8native.protocol.input.FrameObject;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle;
import org.jetbrains.v8.value.ValueLoaderImpl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BacktraceProcessor implements V8CommandCallback {
  private final ContextBuilder.ExpectingBacktraceStep step2;

  BacktraceProcessor(ContextBuilder.ExpectingBacktraceStep step2) {
    this.step2 = step2;
  }

  @Override
  public void messageReceived(CommandResponse response) {
    String commandString = response.command();

    DebuggerCommand command = DebuggerCommand.forString(commandString);
    if (command != DebuggerCommand.BACKTRACE) {
      handleWrongStacktrace();
    }
    CommandResponse.Success successResponse = response.asSuccess();
    if (successResponse == null) {
      handleWrongStacktrace();
    }

    final DebugContext debugContext = setFrames(successResponse, step2);
    final DebugSession debugSession = step2.getInternalContext().getDebugSession();

    JavascriptVm.ScriptsCallback afterScriptsAreLoaded = new JavascriptVm.ScriptsCallback() {
      @Override public void failure(String errorMessage) {
        handleWrongStacktrace();
      }

      @Override public void success(Collection<Script> scripts) {
        debugSession.getDebugEventListener().suspended(debugContext);
      }
    };

    debugSession.getScriptManagerProxy().getAllScripts(afterScriptsAreLoaded, null);
  }

  public static DebugContext setFrames(CommandResponse.Success response, ContextBuilder.ExpectingBacktraceStep step2) {
    List<FrameObject> jsonFrames = response.body().asBacktraceCommandBody().frames();
    if (jsonFrames == null) {
      jsonFrames = Collections.emptyList();
    }

    ValueLoaderImpl valueLoader = step2.getInternalContext().getValueLoader();
    for (SomeHandle handle : response.refs()) {
      valueLoader.addHandleFromRefs(handle);
    }
    return step2.setFrames(jsonFrames);
  }

  @Override
  public void failure(String message) {
    handleWrongStacktrace();
  }

  private static void handleWrongStacktrace() {
    ContextBuilder.buildSequenceFailure();
  }
}
