// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Mirrors <code>DOMNodeInserted</code> event.
 */
@org.chromium.protocolReader.JsonType
public interface ChildNodeInsertedEventData {
  /**
   * Id of the node that has changed.
   */
  int parentNodeId();
  /**
   * If of the previous siblint.
   */
  int previousNodeId();
  /**
   * Inserted node data.
   */
  org.chromium.wip.protocol.input.dom.NodeValue node();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData>("DOMchildNodeInserted", org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMChildNodeInsertedEventData(reader);
    }
  };
}