// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.wip.protocol;

import com.google.gson.stream.JsonReader;
import org.chromium.protocolParser.JsonParseMethod;
import org.chromium.protocolParser.JsonParserRoot;
import org.chromium.wip.protocol.input.GeneratedWipProtocolReader;
import org.chromium.wip.protocol.input.runtime.RemoteObjectValue;

import java.io.IOException;

@JsonParserRoot
public interface WipProtocolReader extends GeneratedWipProtocolReader {
  @JsonParseMethod
  WipCommandResponse parseWipCommandResponse(JsonReader reader) throws IOException;

  @JsonParseMethod
  WipEvent parseWipEvent(JsonReader reader) throws IOException;

  @JsonParseMethod
  WipTabList parseTabList(JsonReader reader) throws IOException;

  // Used by WipContextBuilder because protocol declares exception value as raw object.
  @JsonParseMethod
  RemoteObjectValue parseRemoteObjectValue(JsonReader reader) throws IOException;
}