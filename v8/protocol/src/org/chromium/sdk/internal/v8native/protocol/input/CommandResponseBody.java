// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolReader.JsonSubtypeCasting;
import org.chromium.protocolReader.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle;
import org.jetbrains.jsonProtocol.JsonObjectBased;

import java.util.List;

/**
 * This is empty base type for all command response body types. The actual type
 * depends on a particular command. Note that in JSON sometimes it is an array rather than object
 * (for scripts).
 */
@JsonType
public interface CommandResponseBody extends JsonObjectBased {
  @JsonSubtypeCasting
  BacktraceCommandBody asBacktraceCommandBody();

  @JsonSubtypeCasting
  List<ScriptHandle> asScripts();

  @JsonSubtypeCasting(reinterpret=true)
  ValueHandle asEvaluateBody();

  @JsonSubtypeCasting
  ChangeLiveBody asChangeLiveBody();

  @JsonSubtypeCasting
  RestartFrameBody asRestartFrameBody();

  @JsonSubtypeCasting
  ListBreakpointsBody asListBreakpointsBody();

  @JsonSubtypeCasting
  FlagsBody asFlagsBody();
}
