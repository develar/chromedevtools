// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;
import org.chromium.sdk.internal.v8native.protocol.input.ScopeBody;
import org.chromium.sdk.internal.v8native.protocol.input.V8ProtocolReader;
import org.jetbrains.jsonProtocol.RequestWithResponse;
import org.jetbrains.v8.protocol.ProtocolReponseReader;

/**
 * Represents a "scope" request message.
 */
public class ScopeMessage extends V8Request implements RequestWithResponse<ScopeBody, ProtocolReponseReader> {
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

  @Override
  public ScopeBody readResult(JsonReaderEx jsonReader, ProtocolReponseReader reader) {
    return ((V8ProtocolReader)reader).readScopeResult(jsonReader);
  }
}
