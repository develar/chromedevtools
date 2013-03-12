// Generated source
package org.chromium.wip.protocol.page;

@org.chromium.protocolReader.JsonType
public interface LoadEventFiredEventData {
  double timestamp();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.page.LoadEventFiredEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.page.LoadEventFiredEventData>("PageloadEventFired", org.chromium.wip.protocol.page.LoadEventFiredEventData.class) {
    @Override
    public org.chromium.wip.protocol.page.LoadEventFiredEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageLoadEventFiredEventData(reader);
    }
  };
}