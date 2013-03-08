// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.jsonProtocol.readerGenerator;

import com.google.gson.stream.JsonReader;
import org.chromium.protocolReader.JsonParseMethod;
import org.chromium.protocolReader.JsonParserRoot;
import org.jetbrains.jsonProtocol.readerGenerator.WipMetamodel.Root;

import java.io.IOException;

@JsonParserRoot
public interface WipMetamodelParser {
  @JsonParseMethod
  Root parseRoot(JsonReader reader) throws IOException;
}