// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

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

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData>("DOMcharacterDataModified", org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseDOMCharacterDataModifiedEventData(reader);
    }
  };
}
