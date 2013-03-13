// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Sets node name for a node with given id.
 */
public final class SetNodeName extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.dom.SetNodeNameResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
  /**
   * @param nodeId Id of the node to set name for.
   * @param name New node's name.
   */
  public SetNodeName(int nodeId, String name) {
    writeInt("nodeId", nodeId);
    writeString("name", name);
  }
  @Override
  public String getMethodName() {
    return "DOM.setNodeName";
  }

  @Override
  public SetNodeNameResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMSetNodeNameResult(jsonReader);
  }
}