// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.wip;

import org.chromium.sdk.internal.BaseCommandProcessor;
import org.jetbrains.wip.protocol.CommandResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * An explicit interface for a generic type {@link BaseCommandProcessor.Callback}.
 */
public interface WipCommandCallback extends BaseCommandProcessor.Callback<CommandResponse> {

  /**
   * A default implementation of the callback that separates error responses from
   * success responses.
   */
  abstract class Default implements WipCommandCallback {
    protected abstract void onSuccess(CommandResponse.Success success);
    protected abstract void onError(String message);

    @Override
    public void messageReceived(CommandResponse response) {
      CommandResponse.Success asSuccess = response.asSuccess();
      if (asSuccess != null) {
        onSuccess(asSuccess);
      }
      else {
        String message;
        CommandResponse.Error asError = response.asError();
        if (asError == null) {
          message = "Internal messaging error";
        }
        else {
          List<String> messageList = new ArrayList<String>(2);
          messageList.add(asError.error().message());
          List<String> data = asError.error().data();
          if (data != null) {
            messageList.addAll(data);
          }
          message = messageList.toString();
        }
        onError(message);
      }
    }

    @Override
    public void failure(String message) {
      onError(message);
    }
  }
}
