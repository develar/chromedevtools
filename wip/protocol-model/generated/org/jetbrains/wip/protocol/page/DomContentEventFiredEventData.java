// Generated source
package org.jetbrains.wip.protocol.page;

@org.chromium.protocolReader.JsonType
public interface DomContentEventFiredEventData {
  double timestamp();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.DomContentEventFiredEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.DomContentEventFiredEventData>("PagedomContentEventFired", org.jetbrains.wip.protocol.page.DomContentEventFiredEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.page.DomContentEventFiredEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageDomContentEventFiredEventData(reader);
    }
  };
}