// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonType;

@JsonType
public interface ScriptHandle {
  int id();
  int lineOffset();
  int columnOffset();
  int lineCount();

  //@JsonOptionalField
  //Object data();

  // either sourceStart or source
  @JsonOptionalField
  String sourceStart();

  @JsonOptionalField
  String source();

  int sourceLength();
  int scriptType();
  int compilationType();

  @JsonOptionalField
  SomeSerialized evalFromScript();

  @JsonOptionalField
  JsonReaderEx evalFromLocation();


  @JsonOptionalField
  SomeRef context();

  String text();

  @JsonOptionalField
  String name();
}
