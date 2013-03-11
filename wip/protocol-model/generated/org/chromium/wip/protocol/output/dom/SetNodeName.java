// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Sets node name for a node with given id.
 */
public final class SetNodeName extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.SetNodeNameData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
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
  public org.chromium.wip.protocol.input.dom.SetNodeNameData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDOMSetNodeNameData(data.getDeferredReader());
  }
}