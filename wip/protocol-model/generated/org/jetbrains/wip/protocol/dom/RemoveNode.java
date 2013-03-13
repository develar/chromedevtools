// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Removes node with given id.
 */
public final class RemoveNode extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param nodeId Id of the node to remove.
   */
  public RemoveNode(int nodeId) {
    writeInt("nodeId", nodeId);
  }
  @Override
  public String getMethodName() {
    return "DOM.removeNode";
  }
}