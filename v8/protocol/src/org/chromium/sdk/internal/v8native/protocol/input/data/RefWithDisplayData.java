// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.protocolReader.*;

/**
 * A reference (a pointer) to an object, that prefetches some of its key properties.
 * <p>Gets serialized in mirror-delay.js,
 * JSONProtocolSerializer.prototype.serializeReferenceWithDisplayData_
 */
@JsonType
public interface RefWithDisplayData {
  @JsonOverrideField
  int ref();

  String type();

  @JsonOptionalField
  String className();

  @JsonOptionalField
  @JsonNullable
  JsonReaderEx value();

  // For function.
  @JsonOptionalField
  String inferredName();

  @JsonOptionalField
  long scriptId();
}
