// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import org.chromium.protocolParser.JsonSubtype;
import org.chromium.protocolParser.JsonSubtypeCasting;
import org.chromium.protocolParser.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.FrameObject;

import java.io.IOException;

/**
 * A serialized form of object when it is fully (though shallowly) described. Object always
 * has a type and a handle. (See {@link FrameObject} as a case that makes it a bit more messy).
 * <p>Gets serialized in mirror-delay.js,
 * JSONProtocolSerializer.prototype.serialize_, main part.
 */
@JsonType
public interface SomeHandle extends JsonSubtype<SomeSerialized> {
  /**
   * An integer "handle" of the object. Normally it is unique (for particular suspended-to-resumed
   * period). Some auxiliary objects may have non-unique handles which should be negative.
   */
  long handle();

  String type();

  @JsonSubtypeCasting
  ScriptHandle asScriptHandle() throws IOException;

  @JsonSubtypeCasting
  ValueHandle asValueHandle() throws IOException;

  @JsonSubtypeCasting
  ContextHandle asContextHandle() throws IOException;
}
