// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.wip.protocol;

import org.chromium.wip.protocol.input.GeneratedWipProtocolReader;
import org.jetbrains.jsonProtocol.JsonObjectBased;

/**
 * A base class for all method parameter classes that implies non-empty responses.
 * @param <R> a type of the corresponding response
 */
public abstract class WipRequestWithResponse<R> extends WipRequest {
  public abstract R readResponse(JsonObjectBased success, GeneratedWipProtocolReader reader);
}