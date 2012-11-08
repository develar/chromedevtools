// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import com.google.gson.stream.JsonReader;
import org.chromium.sdk.internal.protocolparser.JsonParseMethod;
import org.chromium.sdk.internal.protocolparser.JsonParserRoot;
import org.chromium.sdk.internal.v8native.protocol.input.data.ContextData;
import org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle;

import java.io.IOException;

/**
 * Interface to native V8 debug protocol parser.
 * @see http://code.google.com/p/v8/wiki/DebuggerProtocol
 */
@JsonParserRoot
public interface V8NativeProtocolParser extends V8NativeProtocolParserTestAccess {

  @JsonParseMethod
  IncomingMessage parseIncomingMessage(JsonReader jsonReader) throws IOException;

  @JsonParseMethod
  SuccessCommandResponse parseSuccessCommandResponse(JsonReader reader) throws IOException;

  @JsonParseMethod
  ContextData parseContextData(JsonReader reader) throws IOException;

  @JsonParseMethod
  ValueHandle parseValueHandle(JsonReader reader) throws IOException;
}
