// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.wip.protocol;

import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonSubtypeCasting;
import org.chromium.protocolReader.JsonType;

import java.util.List;

@JsonType
public interface WipTabList {
  @JsonSubtypeCasting
  List<TabDescription> asTabList();

  @JsonType interface TabDescription {
    String faviconUrl();
    String title();
    String url();

    String thumbnailUrl();

    @JsonOptionalField
    String devtoolsFrontendUrl();

    @JsonOptionalField
    String webSocketDebuggerUrl();
  }
}
