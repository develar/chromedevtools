// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Fired when <code>Container</code>'s child node count has changed.
 */
@org.chromium.protocolReader.JsonType
public interface ChildNodeCountUpdatedEventData {
  /**
   * Id of the node that has changed.
   */
  int nodeId();
  /**
   * New node count.
   */
  int childNodeCount();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.ChildNodeCountUpdatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.ChildNodeCountUpdatedEventData>("DOMchildNodeCountUpdated", org.jetbrains.wip.protocol.dom.ChildNodeCountUpdatedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.dom.ChildNodeCountUpdatedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMChildNodeCountUpdatedEventData(reader);
    }
  };
}