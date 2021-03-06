// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolReader.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo;

import java.util.List;

@JsonType
public interface ListBreakpointsBody {
  List<BreakpointInfo> breakpoints();
}
