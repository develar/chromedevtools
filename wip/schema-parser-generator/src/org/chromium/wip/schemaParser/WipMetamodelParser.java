// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.wip.schemaParser;

import com.google.gson.stream.JsonReader;
import org.chromium.protocolparser.JsonParseMethod;
import org.chromium.protocolparser.JsonParserRoot;
import org.chromium.wip.schemaParser.WipMetamodel.Root;

import java.io.IOException;

@JsonParserRoot
public interface WipMetamodelParser {
  @JsonParseMethod
  Root parseRoot(JsonReader reader) throws IOException;
}