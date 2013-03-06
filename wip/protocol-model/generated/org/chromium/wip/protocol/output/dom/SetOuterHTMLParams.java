// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Sets node HTML markup, returns new node id.
 */
public class SetOuterHTMLParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param nodeId Id of the node to set markup for.
   * @param outerHTML Outer HTML markup to set.
   */
  public SetOuterHTMLParams(int nodeId, String outerHTML) {
    put("nodeId", nodeId);
    put("outerHTML", outerHTML);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".setOuterHTML";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}