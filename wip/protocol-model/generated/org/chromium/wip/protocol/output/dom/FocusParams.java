// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Focuses the given element.
 */
public class FocusParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param nodeId Id of the node to focus.
   */
  public FocusParams(long nodeId) {
    put("nodeId", nodeId);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".focus";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}