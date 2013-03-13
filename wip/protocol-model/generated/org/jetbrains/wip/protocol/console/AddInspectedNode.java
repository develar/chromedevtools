// Generated source
package org.jetbrains.wip.protocol.console;

/**
 * Enables console to refer to the node with given id via $x (see Command Line API for more details $x functions).
 */
public final class AddInspectedNode extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param nodeId DOM node id to be accessible by means of $x command line API.
   */
  public AddInspectedNode(int nodeId) {
    writeInt("nodeId", nodeId);
  }
  @Override
  public String getMethodName() {
    return "Console.addInspectedNode";
  }
}