// Copyright (c) 2012 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolReader.JsonField;
import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonSubtype;
import org.chromium.protocolReader.JsonType;

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
