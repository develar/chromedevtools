// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.sdk.internal.protocolparser.JsonSubtypeCasting;
import org.chromium.sdk.internal.protocolparser.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * This is empty base type for all command response body types. The actual type
 * depends on a particular command. Note that in JSON sometimes it is an array rather than object
 * (for scripts).
 */
@JsonType(subtypesChosenManually=true)
public interface CommandResponseBody {
  @JsonSubtypeCasting
  BacktraceCommandBody asBacktraceCommandBody() throws IOException;

  @JsonSubtypeCasting
  List<ScriptHandle> asScripts() throws IOException;

  @JsonSubtypeCasting
  BreakpointBody asBreakpointBody() throws IOException;

  @JsonSubtypeCasting
  // map refId -> ValueHandle
  Map asLookupMap() throws IOException;

  @JsonSubtypeCasting(reinterpret=true)
  ValueHandle asEvaluateBody() throws IOException;

  @JsonSubtypeCasting
  ScopeBody asScopeBody() throws IOException;

  @JsonSubtypeCasting
  VersionBody asVersionBody() throws IOException;

  @JsonSubtypeCasting
  ChangeLiveBody asChangeLiveBody() throws IOException;

  @JsonSubtypeCasting
  RestartFrameBody asRestartFrameBody() throws IOException;

  @JsonSubtypeCasting
  ListBreakpointsBody asListBreakpointsBody() throws IOException;

  @JsonSubtypeCasting
  FlagsBody asFlagsBody() throws IOException;
}
