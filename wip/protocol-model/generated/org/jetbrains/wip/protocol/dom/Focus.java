// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Focuses the given element.
 */
public final class Focus extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param nodeId Id of the node to focus.
   */
  public Focus(int nodeId) {
    writeInt("nodeId", nodeId);
  }
  @Override
  public String getMethodName() {
    return "DOM.focus";
  }
}