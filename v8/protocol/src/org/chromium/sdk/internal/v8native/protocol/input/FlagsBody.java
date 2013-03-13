// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolReader.JsonType;

import java.util.List;

@JsonType
public interface FlagsBody {
  List<FlagInfo> flags();

  @JsonType
  interface FlagInfo {
    String name();
    boolean value();
  }
}
