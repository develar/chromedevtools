// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Sets node value for a node with given id.
 */
public final class SetNodeValue extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param nodeId Id of the node to set value for.
   * @param value New node's value.
   */
  public SetNodeValue(int nodeId, String value) {
    writeInt("nodeId", nodeId);
    writeString("value", value);
  }
  @Override
  public String getMethodName() {
    return "DOM.setNodeValue";
  }
}