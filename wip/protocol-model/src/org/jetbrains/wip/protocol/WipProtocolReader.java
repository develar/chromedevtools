// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.wip.protocol;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.protocolReader.JsonParseMethod;
import org.chromium.protocolReader.JsonParserRoot;
import org.chromium.wip.protocol.ProtocolReponseReader;
import org.chromium.wip.protocol.runtime.RemoteObjectValue;

@JsonParserRoot
public interface WipProtocolReader extends ProtocolReponseReader {
  @JsonParseMethod
  IncomingMessage readIncomingMessage(JsonReaderEx reader);

  @JsonParseMethod
  WipTabList parseTabList(JsonReaderEx reader);

  // Used by WipContextBuilder because protocol declares exception value as raw object.
  @JsonParseMethod
  RemoteObjectValue parseRemoteObjectValue(JsonReaderEx reader);
}