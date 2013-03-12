// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolReader.*;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle;

import java.util.List;

/**
 * A generic type for all command responses. There are 2 subtypes; one for
 * success responses and one for failure responses.
 */
@JsonType
public interface CommandResponse {
  /**
   * Id of the corresponding request sent to debugger.
   */
  @JsonField(jsonLiteralName="request_seq")
  int requestSeq();

  @JsonOptionalField
  String command();

  boolean success();

  @JsonSubtypeCasting
  Success asSuccess();

  @JsonSubtypeCasting
  Error asError();

  /**
   * A type for success command response message. It holds all the data in
   * "body" field and usually provides "reference" part with data for all referenced objects.
   */
  @JsonType
  interface Success {
    @JsonOverrideField
    boolean success();

    @JsonOptionalField
    CommandResponseBody body();

    @JsonOptionalField
    List<SomeHandle> refs();

    /**
     * @return whether VM continue running after handling the command; however next commands
     *         may change it
     */
    boolean running();
  }

  /**
   * A type for failed command response message. It should contain "message" field
   * hinting at the cause of the failure.
   */
  @JsonType
  interface Error {
    @JsonOverrideField
    boolean success();

    String message();

    @JsonField(jsonLiteralName="request_seq")
    long requestSeq();

    @JsonOptionalField
    String command();
  }
}
