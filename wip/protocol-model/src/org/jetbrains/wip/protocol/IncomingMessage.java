package org.jetbrains.wip.protocol;

import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonSubtypeCasting;
import org.chromium.protocolReader.JsonType;

@JsonType
public interface IncomingMessage {
  @JsonOptionalField
  int id();

  @JsonSubtypeCasting
  CommandResponse asResponse();

  @JsonSubtypeCasting
  WipEvent asNotification();
}
