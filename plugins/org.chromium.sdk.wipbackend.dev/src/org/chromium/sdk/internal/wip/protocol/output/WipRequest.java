// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.wip.protocol.output;

import org.jetrbrains.wip.protocol.BasicConstants;
import org.jetrbrains.wip.protocol.WipParams;
import org.json.simple.JSONObject;

public class WipRequest extends JSONObject {
  public WipRequest(WipParams params) {
    put(BasicConstants.Property.METHOD, params.getRequestName());
    put(BasicConstants.Property.PARAMS, params);
  }
}
