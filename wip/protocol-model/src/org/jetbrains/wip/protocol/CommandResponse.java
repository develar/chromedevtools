// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.wip.protocol;

import org.chromium.protocolReader.*;
import org.jetbrains.jsonProtocol.JsonObjectBased;

import java.util.List;

@JsonType
public interface CommandResponse {
  int id();

  @JsonSubtypeCasting
  Success asSuccess();

  @JsonSubtypeCasting
  Error asError();

  @JsonType
  interface Success {
    @JsonOptionalField
    void error();

    Result result();
  }

  @JsonType
  interface Error {
    @JsonOverrideField
    ErrorInfo error();

    @JsonType
    interface ErrorInfo {
      String message();

      @JsonOptionalField
      List<String> data();

      long code();
    }
  }

  @JsonType(allowsOtherProperties = true)
  interface Result extends JsonObjectBased {
  }
}
