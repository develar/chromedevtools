// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input.data;

import org.chromium.protocolReader.JsonNullable;
import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonType;

@JsonType
public interface BreakpointInfo {
  Type type();

  @JsonOptionalField
  String script_name();

  @JsonOptionalField
  int script_id();

  @JsonOptionalField
  String script_regexp();

  int number();

  int line();

  int column();

  int groupId();

  int hit_count();

  boolean active();

  @JsonNullable
  String condition();

  long ignoreCount();

  enum Type {
    SCRIPTNAME,
    SCRIPTID,
    SCRIPTREGEXP,
    FUNCTION
  }
}