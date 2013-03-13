// Generated source
package org.jetbrains.wip.protocol.page;

@org.chromium.protocolReader.JsonType
public interface LoadEventFiredEventData {
  double timestamp();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.LoadEventFiredEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.LoadEventFiredEventData>("PageloadEventFired", org.jetbrains.wip.protocol.page.LoadEventFiredEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.page.LoadEventFiredEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageLoadEventFiredEventData(reader);
    }
  };
}