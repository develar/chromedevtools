// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolReader.JsonNullable;
import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonSubtype;
import org.chromium.protocolReader.JsonType;

@JsonType
public interface BreakpointBody extends JsonSubtype<CommandResponseBody> {
  long breakpoint();

  @JsonOptionalField
  @JsonNullable
  Object column();

  @JsonOptionalField
  long line();

  @JsonOptionalField
  String script_name();

  @JsonOptionalField
  String type();
}
