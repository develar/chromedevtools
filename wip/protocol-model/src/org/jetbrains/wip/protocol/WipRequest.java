// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.wip.protocol;

import org.jetbrains.jsonProtocol.OutMessage;

public class WipRequest extends OutMessage {
  public WipRequest(WipParams params) {
    put(BasicConstants.Property.METHOD, params.getCommand());
    put(BasicConstants.Property.PARAMS, params);
  }
}
