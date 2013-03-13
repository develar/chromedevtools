package org.jetbrains.v8;

import org.chromium.sdk.internal.BaseCommandProcessor;
import org.chromium.sdk.internal.v8native.protocol.input.CommandResponse;

public interface V8CommandCallback extends BaseCommandProcessor.Callback<CommandResponse> {
}
