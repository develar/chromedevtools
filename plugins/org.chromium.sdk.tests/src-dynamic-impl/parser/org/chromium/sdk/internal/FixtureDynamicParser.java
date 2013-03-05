// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal;

import org.chromium.protocolparser.DynamicParserImpl;
import org.chromium.sdk.internal.browserfixture.FixtureChromeStub.FixtureParser;
import org.chromium.sdk.internal.browserfixture.FixtureChromeStub.Refs;

/**
 * A dynamic implementation of a fixture parser.
 */
public class FixtureDynamicParser {
  public static DynamicParserImpl<FixtureParser> create() {
    return new DynamicParserImpl<FixtureParser>(true, FixtureParser.class, new Class<?>[]{Refs.class});
  }
}