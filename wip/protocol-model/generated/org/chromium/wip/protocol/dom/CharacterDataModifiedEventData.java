// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Mirrors <code>DOMCharacterDataModified</code> event.
 */
@org.chromium.protocolReader.JsonType
public interface CharacterDataModifiedEventData {
  /**
   * Id of the node that has changed.
   */
  int nodeId();
  /**
   * New text value.
   */
  String characterData();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.dom.CharacterDataModifiedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.dom.CharacterDataModifiedEventData>("DOMcharacterDataModified", org.chromium.wip.protocol.dom.CharacterDataModifiedEventData.class) {
    @Override
    public org.chromium.wip.protocol.dom.CharacterDataModifiedEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMCharacterDataModifiedEventData(reader);
    }
  };
}