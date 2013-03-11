package org.jetbrains.rpc;

import org.chromium.sdk.internal.BaseCommandProcessor;

public abstract class CommandCallback<SUCCESS, RESPONSE> implements BaseCommandProcessor.Callback<RESPONSE> {
  protected abstract void onSuccess(SUCCESS success);

  protected abstract void onError(String message);

  @Override
  public void failure(String message) {
    onError(message);
  }
}
