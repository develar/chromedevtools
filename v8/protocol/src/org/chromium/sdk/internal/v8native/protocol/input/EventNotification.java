// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolParser.JsonOptionalField;
import org.chromium.protocolParser.JsonSubtype;
import org.chromium.protocolParser.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle;

import java.util.List;

/**
 * A type for event notification message. Its structure is similar
 * to {@link SuccessCommandResponse}.
 */
@JsonType
public interface EventNotification extends JsonSubtype<IncomingMessage> {
  String event();

  EventNotificationBody body();

  @JsonOptionalField
  List<SomeHandle> refs();
}
