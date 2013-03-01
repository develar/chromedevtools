// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Mirrors <code>DOMCharacterDataModified</code> event.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CharacterDataModifiedEventData {
  /**
   Id of the node that has changed.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId();

  /**
   New text value.
   */
  String characterData();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData>("DOMcharacterDataModified", org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMCharacterDataModifiedEventData(obj);
    }
  };
}
