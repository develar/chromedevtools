// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import com.google.gson.stream.JsonReader;
import org.chromium.protocolParser.JsonParseMethod;
import org.chromium.protocolParser.JsonParserRoot;
import org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef;

import java.io.IOException;

/**
 * A part of {@link V8NativeProtocolParser} interface that is introduced specially for
 * test disposals.
 */
@JsonParserRoot
public interface V8NativeProtocolParserTestAccess {
  @JsonParseMethod
  FrameObject parseFrameObject(JsonReader reader) throws IOException;

  @JsonParseMethod
  SomeRef parseSomeRef(JsonReader reader) throws IOException;

  @JsonParseMethod
  ScriptHandle parseScriptHandle(JsonReader reader) throws IOException;
}