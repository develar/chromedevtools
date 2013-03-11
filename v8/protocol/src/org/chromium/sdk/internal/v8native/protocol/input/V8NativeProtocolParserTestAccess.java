// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.protocolReader.JsonParseMethod;
import org.chromium.protocolReader.JsonParserRoot;
import org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef;

import java.io.IOException;

/**
 * A part of {@link V8ProtocolReader} interface that is introduced specially for
 * test disposals.
 */
@JsonParserRoot
public interface V8NativeProtocolParserTestAccess {
  @JsonParseMethod
  FrameObject parseFrameObject(JsonReaderEx reader) throws IOException;

  @JsonParseMethod
  SomeRef parseSomeRef(JsonReaderEx reader) throws IOException;

  @JsonParseMethod
  ScriptHandle parseScriptHandle(JsonReaderEx reader) throws IOException;
}