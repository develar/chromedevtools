// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.wip;

import org.jetbrains.wip.protocol.WipProtocolReaderImpl;
import org.jetbrains.wip.protocol.WipProtocolReader;

public class WipReaderService {
  private static final WipProtocolReader PARSER = new WipProtocolReaderImpl();

  public static WipProtocolReader get() {
    return PARSER;
  }
}
