// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.protocolParser;

/**
 * A main class that generates all protocol static parsers (except tests).
 */
public class AllProtocolParsersGenerator {
  public static void main(String[] args) {
    LiveEditParserGenerator.main(args);
    V8ParserGenerator.main(args);
  }
}
