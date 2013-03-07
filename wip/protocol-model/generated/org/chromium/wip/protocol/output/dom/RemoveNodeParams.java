// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Removes node with given id.
 */
public class RemoveNodeParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param nodeId Id of the node to remove.
   */
  public RemoveNodeParams(int nodeId) {
    put("nodeId", nodeId);
  }
  @Override
  public String getMethodName() {
    return "DOM.removeNode";
  }
}