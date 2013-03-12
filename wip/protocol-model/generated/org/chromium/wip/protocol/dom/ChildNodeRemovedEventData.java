// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Mirrors <code>DOMNodeRemoved</code> event.
 */
@org.chromium.protocolReader.JsonType
public interface ChildNodeRemovedEventData {
  /**
   * Parent id.
   */
  int parentNodeId();
  /**
   * Id of the node that has been removed.
   */
  int nodeId();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.dom.ChildNodeRemovedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.dom.ChildNodeRemovedEventData>("DOMchildNodeRemoved", org.chromium.wip.protocol.dom.ChildNodeRemovedEventData.class) {
    @Override
    public org.chromium.wip.protocol.dom.ChildNodeRemovedEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMChildNodeRemovedEventData(reader);
    }
  };
}