// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolParser.JsonNullable;
import org.chromium.protocolParser.JsonOptionalField;
import org.chromium.protocolParser.JsonSubtype;
import org.chromium.protocolParser.JsonType;

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
