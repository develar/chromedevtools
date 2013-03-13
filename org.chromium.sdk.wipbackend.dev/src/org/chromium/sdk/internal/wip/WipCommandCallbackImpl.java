package org.chromium.sdk.internal.wip;

import org.jetbrains.rpc.CommandCallback;
import org.jetbrains.wip.protocol.CommandResponse;

import java.util.ArrayList;
import java.util.List;

public abstract class WipCommandCallbackImpl extends CommandCallback<CommandResponse.Success, CommandResponse> implements WipCommandCallback {
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
        List<String> messageList = new ArrayList<String>(2);
        messageList.add(error.error().message());
        List<String> data = error.error().data();
        if (data != null) {
          messageList.addAll(data);
        }
        message = messageList.toString();
      }
      onError(message);
    }
  }
}
