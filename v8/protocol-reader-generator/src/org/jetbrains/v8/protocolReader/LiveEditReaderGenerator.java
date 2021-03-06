// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.protocolReader;

import org.jetbrains.protocolReader.DynamicParserImpl;
import org.jetbrains.protocolReader.ReaderGenerator;
import org.chromium.v8.liveEditProtocol.LiveEditProtocolReader;
import org.chromium.v8.liveEditProtocol.LiveEditResult;

import java.io.IOException;

/**
 * A main class that generates V8 protocol static parser implementation.
 */
public class LiveEditReaderGenerator extends ReaderGenerator {
  public static void main(String[] args) throws IOException {
    mainImpl(args, createConfiguration());
  }

  public static ReaderGenerator.GenerateConfiguration createConfiguration() {
    DynamicParserImpl<LiveEditProtocolReader> result = new DynamicParserImpl<LiveEditProtocolReader>(LiveEditProtocolReader.class,
                                                                                                     new Class[]{LiveEditResult.class});
    return new GenerateConfiguration("org.jetbrains.v8.liveEditProtocol", "LiveEditProtocolReaderImpl", result);
  }
}
