// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolParser.*;
import org.chromium.sdk.internal.v8native.protocol.LiveEditResult;

@JsonType
public interface ChangeLiveBody extends JsonSubtype<CommandResponseBody>  {
  @JsonField(jsonLiteralName="change_log")
  Object getChangeLog();

  @JsonNullable
  @JsonField(jsonLiteralName="result")
  LiveEditResult getResultDescription();

  @JsonOptionalField
  boolean stepin_recommended();
}
