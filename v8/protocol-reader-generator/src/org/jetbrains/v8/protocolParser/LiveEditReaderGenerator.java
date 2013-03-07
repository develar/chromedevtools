// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.protocolParser;

import org.chromium.protocolparser.DynamicParserImpl;
import org.chromium.protocolparser.ReaderGeneratorBase;
import org.chromium.v8.liveEditProtocol.LiveEditProtocolReader;
import org.chromium.v8.liveEditProtocol.LiveEditResult;

/**
 * A main class that generates V8 protocol static parser implementation.
 */
public class LiveEditReaderGenerator extends ReaderGeneratorBase {
  public static void main(String[] args) {
    mainImpl(args, createConfiguration());
  }

  public static ReaderGeneratorBase.GenerateConfiguration createConfiguration() {
    DynamicParserImpl<LiveEditProtocolReader> result = new DynamicParserImpl<LiveEditProtocolReader>(true, LiveEditProtocolReader.class,
                                                                                                     new Class[]{LiveEditResult.class});
    return new GenerateConfiguration("org.chromium.v8.liveEditProtocol", "LiveEditProtocolReaderImpl", result);
  }
}
