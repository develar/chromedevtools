// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonSubtype;
import org.chromium.protocolReader.JsonType;

@JsonType
public interface PropertyWithValue extends JsonSubtype<PropertyObject> {
  @JsonOptionalField
  SomeRef value();
}
