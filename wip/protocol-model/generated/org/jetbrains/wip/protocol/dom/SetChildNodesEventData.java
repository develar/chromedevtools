// Generated source
package org.jetbrains.wip.protocol.dom;

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
  java.util.List<org.jetbrains.wip.protocol.dom.NodeValue> nodes();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.SetChildNodesEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.SetChildNodesEventData>("DOMsetChildNodes", org.jetbrains.wip.protocol.dom.SetChildNodesEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.dom.SetChildNodesEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMSetChildNodesEventData(reader);
    }
  };
}