// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import org.chromium.protocolParser.JsonOptionalField;
import org.chromium.protocolParser.JsonOverrideField;
import org.chromium.protocolParser.JsonSubtypeCasting;
import org.chromium.protocolParser.JsonType;
import org.jetbrains.v8.protocol.input.Handle;

import java.io.IOException;


/**
 * A serialization of a JavaScript value. May be cast to {@link ObjectValueHandle} if value is
 * an object.
 * <p>Gets serialized in mirror-delay.js,
 * JSONProtocolSerializer.prototype.serialize_, main part
 */
@JsonType
public interface ValueHandle extends Handle {
  @JsonOverrideField
  long handle();

  String text();

  @JsonOptionalField
  Object value();

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
  ObjectValueHandle asObject() throws IOException;
}

