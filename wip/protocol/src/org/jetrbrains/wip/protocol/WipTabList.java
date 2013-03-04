// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetrbrains.wip.protocol;

import org.chromium.protocolparser.JsonOptionalField;
import org.chromium.protocolparser.JsonSubtypeCasting;
import org.chromium.protocolparser.JsonType;

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
