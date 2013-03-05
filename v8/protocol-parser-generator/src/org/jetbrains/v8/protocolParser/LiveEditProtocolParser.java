// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.protocolParser;

import com.google.gson.stream.JsonReader;
import org.chromium.protocolParser.JsonParseMethod;
import org.chromium.protocolParser.JsonParserRoot;
import org.chromium.sdk.internal.v8native.protocol.LiveEditResult;

import java.io.IOException;

@JsonParserRoot
public interface LiveEditProtocolParser {
  @JsonParseMethod
  LiveEditResult parseLiveEditResult(JsonReader reader) throws IOException;
}
