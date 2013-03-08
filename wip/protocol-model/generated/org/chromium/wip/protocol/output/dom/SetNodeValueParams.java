// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Sets node value for a node with given id.
 */
public final class SetNodeValueParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param nodeId Id of the node to set value for.
   * @param value New node's value.
   */
  public SetNodeValueParams(int nodeId, String value) {
    put("nodeId", nodeId);
    put("value", value);
  }
  @Override
  public String getMethodName() {
    return "DOM.setNodeValue";
  }
}