// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.wip;

import org.chromium.wip.protocol.WipProtocolReaderImpl;
import org.jetbrains.wip.protocol.WipProtocolReader;

/**
 * An accessor to generated implementation of a WIP parser.
 */
public class WipParserAccess {
  private static final WipProtocolReader PARSER = new WipProtocolReaderImpl();

  public static WipProtocolReader get() {
    return PARSER;
  }
}
