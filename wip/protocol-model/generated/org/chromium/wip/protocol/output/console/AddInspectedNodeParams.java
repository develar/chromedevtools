// Generated source
package org.chromium.wip.protocol.output.console;

/**
 * Enables console to refer to the node with given id via $x (see Command Line API for more details $x functions).
 */
public final class AddInspectedNodeParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param nodeId DOM node id to be accessible by means of $x command line API.
   */
  public AddInspectedNodeParams(int nodeId) {
    put("nodeId", nodeId);
  }
  @Override
  public String getMethodName() {
    return "Console.addInspectedNode";
  }
}