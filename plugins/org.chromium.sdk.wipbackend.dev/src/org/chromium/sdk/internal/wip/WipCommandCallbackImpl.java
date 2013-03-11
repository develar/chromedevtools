package org.chromium.sdk.internal.wip;

import org.jetbrains.rpc.CommandCallback;
import org.jetbrains.wip.protocol.CommandResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * A default implementation of the callback that separates error responses from
 * success responses.
 */
public abstract class WipCommandCallbackImpl extends CommandCallback<CommandResponse.Success, CommandResponse> implements WipCommandCallback {
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
}
