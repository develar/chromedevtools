// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Sets node HTML markup, returns new node id.
 */
public final class SetOuterHTML extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param nodeId Id of the node to set markup for.
   * @param outerHTML Outer HTML markup to set.
   */
  public SetOuterHTML(int nodeId, String outerHTML) {
    put("nodeId", nodeId);
    put("outerHTML", outerHTML);
  }
  @Override
  public String getMethodName() {
    return "DOM.setOuterHTML";
  }
}