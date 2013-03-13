// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonOverrideField;
import org.chromium.protocolReader.JsonSubtypeCasting;
import org.chromium.protocolReader.JsonType;
import org.jetbrains.v8.protocol.input.Handle;


/**
 * A serialization of a JavaScript value. May be cast to {@link ObjectValueHandle} if value is
 * an object.
 * <p>Gets serialized in mirror-delay.js,
 * JSONProtocolSerializer.prototype.serialize_, main part
 */
@JsonType
public interface ValueHandle extends Handle {
  @JsonOverrideField
  int handle();

  String text();

  @JsonOptionalField
  String value();

  @JsonOverrideField
  String type();

  // for string type (the true length, value field may be truncated)
  @JsonOptionalField
  long length();
  @JsonOptionalField
  long fromIndex();
  @JsonOptionalField
  long toIndex();

  @JsonOptionalField
  String className();

  @JsonSubtypeCasting
  ObjectValueHandle asObject();
}

