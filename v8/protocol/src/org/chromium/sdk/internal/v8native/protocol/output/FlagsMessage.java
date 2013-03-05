// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;

import java.io.IOException;
import java.util.Map;

/**
 * Represents a "flags" V8 request message.
 */
public class FlagsMessage extends ContextlessDebuggerMessage {
  public FlagsMessage(Map<String, Boolean> flags) {
    super(DebuggerCommand.FLAGS.value);

    if (flags != null) {
      try {
        addArgumentsName();
        writer.name("flags");
        writer.beginArray();
        for (Map.Entry<String, Boolean> en : flags.entrySet()) {
          writer.beginObject();
          writer.name("name").value(en.getKey());
          writer.name("value").value(en.getKey());
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
