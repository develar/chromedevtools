// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.v8.liveEditProtocol;

import com.google.gson.stream.JsonReader;
import org.chromium.protocolParser.JsonParseMethod;
import org.chromium.protocolParser.JsonParserRoot;

import java.io.IOException;

@JsonParserRoot
public interface LiveEditProtocolReader {
  @JsonParseMethod
  LiveEditResult parseLiveEditResult(JsonReader reader) throws IOException;
}
