// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

@org.chromium.protocolParser.JsonType
public interface DomContentEventFiredEventData {
  Number timestamp();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.DomContentEventFiredEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.DomContentEventFiredEventData>("PagedomContentEventFired", org.chromium.wip.protocol.inputpage.DomContentEventFiredEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.DomContentEventFiredEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parsePageDomContentEventFiredEventData(reader);
    }
  };
}
