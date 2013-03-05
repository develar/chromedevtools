// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Fired when backend wants to provide client with the missing DOM structure. This happens upon most of the calls requesting node ids.
 */
@org.chromium.protocolParser.JsonType
public interface SetChildNodesEventData {
  /**
   Parent node id to populate with children.
   */
  long parentId();

  /**
   Child nodes array.
   */
  java.util.List<org.chromium.wip.protocol.inputdom.NodeValue> nodes();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.SetChildNodesEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.SetChildNodesEventData>("DOMsetChildNodes", org.chromium.wip.protocol.inputdom.SetChildNodesEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.SetChildNodesEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMSetChildNodesEventData(reader);
    }
  };
}
