// Generated source
package org.chromium.wip.protocol.input.page;

@org.chromium.protocolReader.JsonType
public interface LoadEventFiredEventData {
  double timestamp();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.LoadEventFiredEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.LoadEventFiredEventData>("PageloadEventFired", org.chromium.wip.protocol.input.page.LoadEventFiredEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.LoadEventFiredEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageLoadEventFiredEventData(reader);
    }
  };
}