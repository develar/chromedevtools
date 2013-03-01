// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Fired when backend wants to provide client with the missing DOM structure. This happens upon most of the calls requesting node ids.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface SetChildNodesEventData {
  /**
   Parent node id to populate with children.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ parentId();

  /**
   Child nodes array.
   */
  java.util.List<org.chromium.wip.protocol.inputdom.NodeValue> nodes();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.SetChildNodesEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.SetChildNodesEventData>("DOMsetChildNodes", org.chromium.wip.protocol.inputdom.SetChildNodesEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.SetChildNodesEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMSetChildNodesEventData(obj);
    }
  };
}
