// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.wip.protocol;

import org.chromium.protocolReader.JsonField;
import org.jetbrains.jsonProtocol.JsonObjectBased;
import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonType;

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
