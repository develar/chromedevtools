// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import java.util.List;

import org.chromium.protocolReader.JsonSubtype;
import org.chromium.protocolReader.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo;

@JsonType
public interface ListBreakpointsBody extends JsonSubtype<CommandResponseBody> {
  List<BreakpointInfo> breakpoints();
}
