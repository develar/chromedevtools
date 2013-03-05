// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal;

import org.chromium.protocolparser.GeneratedCodeMap;
import org.chromium.protocolparser.ReaderGeneratorBase;
import org.jetbrains.v8.protocolParser.V8ReaderGenerator;

import java.util.Collections;

/**
 * A main class that generates test Fixture static parser implementation.
 */
public class FixtureParserGenerator extends ReaderGeneratorBase {
  public static void main(String[] args) {
    mainImpl(args, createConfiguration());
  }

  public static GenerateConfiguration createConfiguration() {
    GeneratedCodeMap baseV8ParserMap = buildParserMap(V8ReaderGenerator.createConfiguration());
    return new GenerateConfiguration("org.chromium.sdk.internal", "GeneratedV8FixtureParser",
        FixtureDynamicParser.create(),
        Collections.singletonList(baseV8ParserMap));
  }
}
