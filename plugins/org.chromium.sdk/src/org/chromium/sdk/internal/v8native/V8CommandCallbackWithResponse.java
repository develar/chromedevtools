// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native;

import org.chromium.sdk.internal.v8native.protocol.input.CommandResponse;
import org.chromium.v8.protocol.ProtocolService;
import org.jetbrains.jsonProtocol.RequestWithResponse;
import org.jetbrains.v8.protocol.ProtocolReponseReader;

public abstract class V8CommandCallbackWithResponse<RESULT, PROCESSED_RESULT> extends V8CommandCallbackImpl {
  RequestWithResponse<RESULT, ProtocolReponseReader> request;
  PROCESSED_RESULT result;

  @Override
  protected final void onSuccess(CommandResponse.Success success) {
    assert request != null;
    result = success(request.readResult(success.body().getDeferredReader(), ProtocolService.PROTOCOL_READER), success);
    request = null;
  }

  @Override
  protected void onError(String message) {
    throw new RuntimeException("Unsuccessful command: " + message);
  }

  protected abstract PROCESSED_RESULT success(RESULT result, CommandResponse.Success response);
}
