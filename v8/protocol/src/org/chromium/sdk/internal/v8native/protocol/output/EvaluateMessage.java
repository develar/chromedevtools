// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;
import org.jetbrains.jsonProtocol.StringIntPair;

import java.io.IOException;
import java.util.List;

/**
 * Represents an "evaluate" V8 request message.
 */
public class EvaluateMessage extends DebuggerMessage {
  /**
   * @param expression to evaluate
   * @param frame number (top is 0).
   * @param disableBreak nullable. Default is true
   * @param additionalContext nullable
   */
  public EvaluateMessage(String expression, int frame, boolean disableBreak, List<StringIntPair> additionalContext) {
    super(DebuggerCommand.EVALUATE.value);
    putArgument("expression", expression);
    if (frame != -1) {
      putArgument("frame", frame);
    }
    else {
      putArgument("global", true);
    }

    putArgument("disable_break", disableBreak);
    putArgument("inlineRefs", true);
    if (additionalContext != null) {
      try {
        addArgumentsName();
        writer.name("additional_context");
        writer.beginArray();
        for (StringIntPair entry : additionalContext) {
          writer.beginObject();
          writer.name("name").value(entry.name);
          writer.name("handle").value(entry.value);
          writer.endObject();
        }
        writer.endArray();
      }
      catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
