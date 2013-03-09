// Generated source
package org.chromium.wip.protocol.output.dom;

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