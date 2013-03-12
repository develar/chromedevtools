// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.protocolReader.JsonParseMethod;
import org.chromium.protocolReader.JsonParserRoot;
import org.chromium.sdk.internal.v8native.protocol.input.data.ContextData;
import org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle;
import org.jetbrains.v8.protocol.ProtocolReponseReader;

/**
 * Interface to native V8 debug protocol parser.
 * @see http://code.google.com/p/v8/wiki/DebuggerProtocol
 */
@JsonParserRoot
public interface V8ProtocolReader extends ProtocolReponseReader {
  @JsonParseMethod
  IncomingMessage readIncomingMessage(JsonReaderEx reader);

  @JsonParseMethod
  ContextData readContextData(JsonReaderEx reader);

  @JsonParseMethod
  ValueHandle readValueHandle(JsonReaderEx reader);

  @JsonParseMethod
  ScopeBody readScopeResult(JsonReaderEx reader);
}
