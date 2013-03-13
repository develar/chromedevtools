// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.protocolReader;

import java.io.IOException;

/**
 * A main class that generates all protocol static parsers (except tests).
 */
public class AllProtocolReadersGenerator {
  public static void main(String[] args) throws IOException {
    LiveEditReaderGenerator.main(args);
    V8ReaderGenerator.main(args);
  }
}