// Generated source
package org.chromium.wip.protocol.dom;

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
  java.util.List<org.chromium.wip.protocol.dom.NodeValue> nodes();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.dom.SetChildNodesEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.dom.SetChildNodesEventData>("DOMsetChildNodes", org.chromium.wip.protocol.dom.SetChildNodesEventData.class) {
    @Override
    public org.chromium.wip.protocol.dom.SetChildNodesEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMSetChildNodesEventData(reader);
    }
  };
}