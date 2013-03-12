// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.protocolReader.JsonField;
import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonSubtype;
import org.chromium.protocolReader.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.ScopeRef;

import java.util.List;

@JsonType
public interface FunctionValueHandle extends JsonSubtype<ObjectValueHandle> {
  @JsonOptionalField
  int position();

  @JsonOptionalField
  int line();

  @JsonOptionalField
  JsonReaderEx script();

  boolean resolved();

  @JsonOptionalField
  String source();

  @JsonOptionalField
  String inferredName();

  @JsonOptionalField
  String name();

  @JsonOptionalField
  int column();

  @JsonOptionalField
  int scriptId();

  @JsonField
  List<ScopeRef> scopes();
}
