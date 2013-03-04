// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.wip.protocol;

import org.chromium.protocolParser.*;
import org.jetbrains.wip.protocol.BasicConstants;

import java.util.List;

@JsonType
public interface WipCommandResponse {
  @JsonField(jsonLiteralName = BasicConstants.Property.ID)
  Long id();

  @JsonSubtypeCasting
  Success asSuccess();
  @JsonSubtypeCasting Error asError();

  @JsonType
  interface Success extends JsonSubtype<WipCommandResponse> {
    @JsonOptionalField
    Void error();

    @JsonField(jsonLiteralName="result")
    Data data();
  }

  @JsonType
  interface Error extends JsonSubtype<WipCommandResponse> {
    @JsonOverrideField
    ErrorInfo error();

    @JsonField(jsonLiteralName="result")
    @JsonOptionalField
    Data data();

    @JsonType
    interface ErrorInfo {
      String message();

      @JsonOptionalField
      List<String> data();
      long code();
    }
  }

  @JsonType(allowsOtherProperties=true)
  interface Data extends JsonObjectBased {
  }
}