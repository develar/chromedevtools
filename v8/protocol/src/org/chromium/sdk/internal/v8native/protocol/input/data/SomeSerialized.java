// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import org.chromium.protocolParser.JsonSubtypeCasting;
import org.chromium.protocolParser.JsonType;

import java.io.IOException;

/**
 * A serialized form of object. There may be 2 schemas: reference (like pointer) or full description
 * called "a handle" hereafter. It appears that it's not always statically known which of schemas
 * is used in every place; thus it requires a base type like this.
 * <p>Gets serialized in mirror-delay.js,
 * JSONProtocolSerializer.prototype.serialize_
 */
@JsonType
public interface SomeSerialized {
  @JsonSubtypeCasting
  SomeRef asSomeRef() throws IOException;

  @JsonSubtypeCasting
  SomeHandle asSmthWithHandle() throws IOException;
}
