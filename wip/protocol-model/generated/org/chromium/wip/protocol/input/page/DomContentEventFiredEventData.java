// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.page;

@org.chromium.protocolParser.JsonType
public interface DomContentEventFiredEventData {
  Number timestamp();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.DomContentEventFiredEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.DomContentEventFiredEventData>("PagedomContentEventFired", org.chromium.wip.protocol.input.page.DomContentEventFiredEventData.class) {
    @Override public org.chromium.wip.protocol.input.page.DomContentEventFiredEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parsePageDomContentEventFiredEventData(reader);
    }
  };
}
