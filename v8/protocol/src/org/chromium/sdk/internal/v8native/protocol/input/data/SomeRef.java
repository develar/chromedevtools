// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.protocolReader.*;

/**
 * A reference form of object data serialization. Basically it only has one field "ref" that
 * is "handle" of an object. Using this integer value as a key, all the object data may be
 * requested (lookup'ed) from debugger. However some additional data may be available via subtype.
 * <p>Gets serialized in mirror-delay.js,
 * first part of JSONProtocolSerializer.prototype.serialize_
 */
@JsonType
public interface SomeRef {
  int ref();

  String type();

  @JsonOptionalField
  @JsonNullable
  JsonReaderEx value();

  @JsonOptionalField
  String className();

  @JsonOptionalField
  String inferredName();

  @JsonOptionalField
  int scriptId();
}
