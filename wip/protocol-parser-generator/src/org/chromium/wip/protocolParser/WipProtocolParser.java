// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.wip.protocolParser;

import com.google.gson.stream.JsonReader;
import org.chromium.protocolParser.JsonParseMethod;
import org.chromium.protocolParser.JsonParserRoot;
import org.chromium.wip.protocol.input.WipGeneratedParserRoot;
import org.chromium.wip.protocol.inputruntime.RemoteObjectValue;
import org.jetbrains.wip.protocol.WipCommandResponse;
import org.jetbrains.wip.protocol.WipEvent;
import org.jetbrains.wip.protocol.WipTabList;

import java.io.IOException;

/**
 * Interface to WIP protocol parser. It includes generated part {@link WipGeneratedParserRoot}.
 */
@JsonParserRoot
public interface WipProtocolParser extends WipGeneratedParserRoot {
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