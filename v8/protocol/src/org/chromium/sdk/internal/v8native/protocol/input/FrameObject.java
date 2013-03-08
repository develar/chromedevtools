// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolReader.JsonField;
import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef;

import java.util.List;
import java.util.Map;

/**
 * A frame mirror object type. Technically it is almost subtype of {@link org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle}:
 * it gets serialized from the same code; however, it never gets handle field so
 * we have to treat it as a separate type. Hopefully frame object will never
 * get mixed with other objects on remote side.
 */
@JsonType
public interface FrameObject {
  long index();

  Map func();

  String text();

  long line();

  String sourceLineText();

  @JsonOptionalField
  SomeRef script();

  @JsonField
  List<PropertyObject> arguments();

  @JsonField
  List<PropertyObject> locals();

  @JsonField
  SomeRef receiver();

  @JsonField
  List<ScopeRef> scopes();

  boolean constructCall();

  String type();

  int position();

  int column();

  boolean debuggerFrame();
}
