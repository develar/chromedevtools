// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.shellprotocol.tools.protocol.input;

import org.chromium.sdk.internal.protocolparser.JsonProtocolModelParseException;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.DynamicParserImpl;

/**
 * Dynamic implementation of tools protocol parser.
 */
public class DynamicToolsProtocolParser {
  public static DynamicParserImpl<ToolsProtocolParser> createDynamic() {
    try {
      return new DynamicParserImpl<ToolsProtocolParser>(ToolsProtocolParser.class, new Class[]{ToolsMessage.class, ToolsMessage.Data.class});
    }
    catch (JsonProtocolModelParseException e) {
      throw new RuntimeException(e);
    }
  }
}
