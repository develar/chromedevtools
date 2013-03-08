// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Focuses the given element.
 */
public final class FocusParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param nodeId Id of the node to focus.
   */
  public FocusParams(int nodeId) {
    put("nodeId", nodeId);
  }
  @Override
  public String getMethodName() {
    return "DOM.focus";
  }
}