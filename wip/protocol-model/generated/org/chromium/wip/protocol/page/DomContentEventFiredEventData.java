// Generated source
package org.chromium.wip.protocol.page;

@org.chromium.protocolReader.JsonType
public interface DomContentEventFiredEventData {
  double timestamp();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.page.DomContentEventFiredEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.page.DomContentEventFiredEventData>("PagedomContentEventFired", org.chromium.wip.protocol.page.DomContentEventFiredEventData.class) {
    @Override
    public org.chromium.wip.protocol.page.DomContentEventFiredEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageDomContentEventFiredEventData(reader);
    }
  };
}