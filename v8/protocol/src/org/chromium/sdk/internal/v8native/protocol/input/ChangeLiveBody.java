// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.protocolReader.*;
import org.chromium.v8.liveEditProtocol.LiveEditResult;

@JsonType
public interface ChangeLiveBody {
  @JsonField(jsonLiteralName="change_log")
  JsonReaderEx getChangeLog();

  @JsonNullable
  @JsonField(jsonLiteralName="result")
  LiveEditResult getResultDescription();

  @JsonOptionalField
  boolean stepin_recommended();
}
