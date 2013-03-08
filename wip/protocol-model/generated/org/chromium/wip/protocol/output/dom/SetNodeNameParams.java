// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Sets node name for a node with given id.
 */
public final class SetNodeNameParams extends org.jetbrains.wip.WipRequestWithResponse<org.chromium.wip.protocol.input.dom.SetNodeNameData> {
  /**
   * @param nodeId Id of the node to set name for.
   * @param name New node's name.
   */
  public SetNodeNameParams(int nodeId, String name) {
    put("nodeId", nodeId);
    put("name", name);
  }
  @Override
  public String getMethodName() {
    return "DOM.setNodeName";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.SetNodeNameData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMSetNodeNameData(data.getDeferredReader());
  }
}