// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Fired when backend wants to provide client with the missing DOM structure. This happens upon most of the calls requesting node ids.
 */
@org.chromium.protocolReader.JsonType
public interface SetChildNodesEventData {
  /**
   * Parent node id to populate with children.
   */
  int parentId();
  /**
   * Child nodes array.
   */
  java.util.List<org.chromium.wip.protocol.input.dom.NodeValue> nodes();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.SetChildNodesEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.SetChildNodesEventData>("DOMsetChildNodes", org.chromium.wip.protocol.input.dom.SetChildNodesEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.SetChildNodesEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMSetChildNodesEventData(reader);
    }
  };
}