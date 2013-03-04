// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.wip.protocol;

import org.jetbrains.wip.protocol.BasicConstants;
import org.jetbrains.wip.protocol.WipParams;
import org.json.simple.JSONObject;

public class WipRequest {
  public WipRequest(WipParams params) {
    put(BasicConstants.Property.METHOD, params.getRequestName());
    put(BasicConstants.Property.PARAMS, params);
  }
}
