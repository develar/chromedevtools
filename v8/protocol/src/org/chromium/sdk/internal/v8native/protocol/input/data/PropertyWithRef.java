// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import org.chromium.protocolParser.JsonOptionalField;
import org.chromium.protocolParser.JsonSubtype;
import org.chromium.protocolParser.JsonType;

@JsonType
public interface PropertyWithRef extends JsonSubtype<PropertyObject> {
  @JsonOptionalField
  void value();

  long ref();

  @JsonOptionalField
  long attributes();

  @JsonOptionalField
  long propertyType();
}
