// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolParser.*;

/**
 * A generic type for all command responses. There are 2 subtypes; one for
 * success responses and one for failure responses.
 */
@JsonType
public interface CommandResponse extends JsonSubtype<IncomingMessage> {
  @JsonOverrideField
  MessageType type();

  /**
   * Id of the corresponding request sent to debugger.
   */
  @JsonField(jsonLiteralName="request_seq")
  long requestSeq();

  @JsonOptionalField
  String command();

  boolean success();

  @JsonSubtypeCasting
  SuccessCommandResponse asSuccess();

  @JsonSubtypeCasting
  FailedCommandResponse asFailure();
}
