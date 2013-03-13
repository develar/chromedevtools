package org.jetbrains.v8;

import org.chromium.sdk.internal.v8native.protocol.input.CommandResponse;
import org.jetbrains.rpc.CommandCallback;

public abstract class V8CommandCallbackImpl extends CommandCallback<CommandResponse.Success, CommandResponse> implements V8CommandCallback {
  @Override
  public final void messageReceived(CommandResponse response) {
    CommandResponse.Success success = response.asSuccess();
    if (success != null) {
      onSuccess(success);
    }
    else {
      String message;
      CommandResponse.Error error = response.asError();
      if (error == null) {
        message = "Internal messaging error";
      }
      else {
        message = error.message();
      }
      onError(message);
    }
  }
}