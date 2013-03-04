// Copyright (c) 2012 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolParser.JsonField;
import org.chromium.protocolParser.JsonOptionalField;
import org.chromium.protocolParser.JsonSubtype;
import org.chromium.protocolParser.JsonType;

@JsonType
public interface RestartFrameBody extends JsonSubtype<CommandResponseBody> {
  @JsonField(jsonLiteralName="result")
  ResultDescription getResultDescription();

  @JsonType
  interface ResultDescription {
    @JsonOptionalField
    boolean stack_update_needs_step_in();
  }
}
