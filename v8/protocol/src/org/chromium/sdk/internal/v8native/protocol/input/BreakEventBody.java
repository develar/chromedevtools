// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import com.google.gson.stream.JsonReader;
import org.chromium.protocolParser.JsonOptionalField;
import org.chromium.protocolParser.JsonSubtype;
import org.chromium.protocolParser.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle;

@JsonType
public interface BreakEventBody extends JsonSubtype<EventNotificationBody> {
  @JsonOptionalField
  long[] breakpoints();

  @JsonOptionalField
  ValueHandle exception();

  @JsonOptionalField
  String sourceLineText();

  @JsonOptionalField
  boolean uncaught();

  @JsonOptionalField
  long sourceLine();

  @JsonOptionalField
  String invocationText();

  @JsonOptionalField
  JsonReader script();

  @JsonOptionalField
  long sourceColumn();
}
