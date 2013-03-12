// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Fired when <code>Document</code> has been totally updated. Node ids are no longer valid.
 */
@org.chromium.protocolReader.JsonType
public interface DocumentUpdatedEventData {

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.dom.DocumentUpdatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.dom.DocumentUpdatedEventData>("DOMdocumentUpdated", org.chromium.wip.protocol.dom.DocumentUpdatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.dom.DocumentUpdatedEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMDocumentUpdatedEventData(reader);
    }
  };
}