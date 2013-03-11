// Generated source
package org.chromium.wip.protocol.input.page;

@org.chromium.protocolReader.JsonType
public interface DomContentEventFiredEventData {
  double timestamp();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.DomContentEventFiredEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.DomContentEventFiredEventData>("PagedomContentEventFired", org.chromium.wip.protocol.input.page.DomContentEventFiredEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.DomContentEventFiredEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageDomContentEventFiredEventData(reader);
    }
  };
}