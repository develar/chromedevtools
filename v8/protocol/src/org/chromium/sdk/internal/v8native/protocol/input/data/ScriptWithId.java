package org.chromium.sdk.internal.v8native.protocol.input.data;

import org.chromium.protocolParser.JsonType;

@JsonType
public interface ScriptWithId {
  long id();
}
