package org.chromium.sdk.internal.v8native.protocol.input.data;

import org.chromium.protocolReader.JsonType;

@JsonType
public interface ScriptWithId {
  int id();
}
