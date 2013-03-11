// Generated source
package org.chromium.wip.protocol.input.dom;

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

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData>("DOMcharacterDataModified", org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData parse(org.chromium.wip.protocol.input.ProtocolReponseReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseDOMCharacterDataModifiedEventData(reader);
    }
  };
}