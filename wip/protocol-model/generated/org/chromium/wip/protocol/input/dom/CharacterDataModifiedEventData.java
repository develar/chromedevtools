// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.dom;

/**
 Mirrors <code>DOMCharacterDataModified</code> event.
 */
@org.chromium.protocolParser.JsonType
public interface CharacterDataModifiedEventData {
  /**
   Id of the node that has changed.
   */
  long nodeId();

  /**
   New text value.
   */
  String characterData();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData>("DOMcharacterDataModified", org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData.class) {
    @Override public org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMCharacterDataModifiedEventData(reader);
    }
  };
}
