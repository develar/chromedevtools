// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.shellprotocol.tools.protocol.input;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonSubtypeCasting;
import org.chromium.protocolReader.JsonType;
import org.jetbrains.jsonProtocol.StringIntPair;

import java.io.IOException;
import java.util.List;

@JsonType
public interface ToolsMessage {
  String command();

  int result();

  @JsonOptionalField
  Data data();

  @JsonType
  interface Data {
    // V8Debugger tool.
    @JsonSubtypeCasting
    JsonReaderEx asDebuggerData();

    @JsonSubtypeCasting
    String asNavigatedData() throws IOException;


    // DevToolsService tool.
    /**
     * List of pairs (long id and String url) packed as array.
     */
    @JsonSubtypeCasting
    List<StringIntPair> asListTabsData() throws IOException;

    @JsonSubtypeCasting
    String asVersionData() throws IOException;
  }
}
