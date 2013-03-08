// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Sets node HTML markup, returns new node id.
 */
public final class SetOuterHTMLParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param nodeId Id of the node to set markup for.
   * @param outerHTML Outer HTML markup to set.
   */
  public SetOuterHTMLParams(int nodeId, String outerHTML) {
    put("nodeId", nodeId);
    put("outerHTML", outerHTML);
  }
  @Override
  public String getMethodName() {
    return "DOM.setOuterHTML";
  }
}