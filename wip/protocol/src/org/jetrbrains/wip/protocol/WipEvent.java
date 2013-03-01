// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetrbrains.wip.protocol;

import org.chromium.sdk.internal.protocolparser.JsonField;
import org.chromium.sdk.internal.protocolparser.JsonObjectBased;
import org.chromium.sdk.internal.protocolparser.JsonOptionalField;
import org.chromium.sdk.internal.protocolparser.JsonType;

@JsonType
public interface WipEvent {
  String method();

  @JsonField(jsonLiteralName = "params")
  @JsonOptionalField
  Data data();

  @JsonType(allowsOtherProperties=true)
  interface Data extends JsonObjectBased {
  }
}
