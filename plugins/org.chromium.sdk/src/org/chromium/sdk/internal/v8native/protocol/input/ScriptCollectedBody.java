package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.sdk.internal.protocolparser.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.data.ScriptWithId;

@JsonType
public interface ScriptCollectedBody {
  ScriptWithId script();
}