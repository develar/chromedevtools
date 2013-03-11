// Generated source
package org.chromium.wip.protocol.input.page;

@org.chromium.protocolReader.JsonType
public interface LoadEventFiredEventData {
  double timestamp();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.LoadEventFiredEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.LoadEventFiredEventData>("PageloadEventFired", org.chromium.wip.protocol.input.page.LoadEventFiredEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.LoadEventFiredEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return parser.parsePageLoadEventFiredEventData(reader);
    }
  };
}