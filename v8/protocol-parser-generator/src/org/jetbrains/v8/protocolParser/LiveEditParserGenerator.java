// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.protocolParser;

import org.chromium.protocolparser.DynamicParserImpl;
import org.chromium.protocolparser.JsonProtocolModelParseException;
import org.chromium.protocolparser.ParserGeneratorBase;

/**
 * A main class that generates V8 protocol static parser implementation.
 */
public class LiveEditParserGenerator extends ParserGeneratorBase {
  public static void main(String[] args) {
    mainImpl(args, createConfiguration());
  }

  public static DynamicParserImpl<LiveEditProtocolParser> create() {
    try {
      return new DynamicParserImpl<LiveEditProtocolParser>(true, LiveEditProtocolParser.class,
                                                           new Class[]{
                                                             LiveEditResult.class,
                                                             LiveEditResult.OldTreeNode.class,
                                                             LiveEditResult.NewTreeNode.class,
                                                             LiveEditResult.Positions.class,
                                                             LiveEditResult.TextualDiff.class,
                                                           });
    }
    catch (JsonProtocolModelParseException e) {
      throw new RuntimeException(e);
    }
  }

  public static ParserGeneratorBase.GenerateConfiguration createConfiguration() {
    return new GenerateConfiguration("org.chromium.sdk.internal.liveeditprotocol",
                                     "GeneratedLiveEditProtocolParser", create());
  }
}
