// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.sdk.internal.protocolparser.*;

/**
 * A type for failed command response message. It should contain "message" field
 * hinting at the cause of the failure.
 */
@JsonType
public interface FailedCommandResponse extends JsonSubtype<CommandResponse> {
  @JsonOverrideField
  boolean success();

  String message();

  @JsonField(jsonLiteralName="request_seq")
  long requestSeq();

  @JsonOptionalField
  String command();
}