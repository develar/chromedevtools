// Generated source
package org.chromium.wip.protocol.input.page;

@org.chromium.protocolReader.JsonType
public interface DomContentEventFiredEventData {
  double timestamp();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.DomContentEventFiredEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.DomContentEventFiredEventData>("PagedomContentEventFired", org.chromium.wip.protocol.input.page.DomContentEventFiredEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.DomContentEventFiredEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parsePageDomContentEventFiredEventData(reader);
    }
  };
}