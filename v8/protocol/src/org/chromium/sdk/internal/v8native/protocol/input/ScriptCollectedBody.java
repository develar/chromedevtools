package org.chromium.sdk.internal.v8native.protocol.input;

import org.chromium.protocolParser.JsonSubtype;
import org.chromium.protocolParser.JsonType;
import org.chromium.sdk.internal.v8native.protocol.input.data.ScriptWithId;

@JsonType
public interface ScriptCollectedBody extends JsonSubtype<EventNotificationBody> {
  ScriptWithId script();
}