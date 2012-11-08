// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.shellprotocol.tools.protocol.input;

import com.google.gson.stream.JsonReader;
import org.chromium.sdk.internal.protocolparser.JsonParseMethod;
import org.chromium.sdk.internal.protocolparser.JsonParserRoot;

import java.io.IOException;

/**
 * Interface to Chroimum 'DevTools' protocol parser.
 * @see http://code.google.com/p/chromedevtools/wiki/ChromeDevToolsProtocol
 */
@JsonParserRoot
public interface ToolsProtocolParser {

  @JsonParseMethod
  ToolsMessage parseToolsMessage(JsonReader reader) throws IOException;

}
