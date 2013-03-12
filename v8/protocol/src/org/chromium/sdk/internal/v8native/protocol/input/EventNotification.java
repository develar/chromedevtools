// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle;

import java.util.List;

/**
 * A type for event notification message. Its structure is similar
 * to {@link org.chromium.sdk.internal.v8native.protocol.input.CommandResponse.Success}.
 */
@JsonType
public interface EventNotification {
  String event();

  EventNotificationBody body();

  @JsonOptionalField
  List<SomeHandle> refs();
}
