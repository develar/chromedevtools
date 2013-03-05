// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.console;

/**
Enables console to refer to the node with given id via $x (see Command Line API for more details $x functions).
 */
public class AddInspectedNodeParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param nodeId DOM node id to be accessible by means of $x command line API.
   */
  public AddInspectedNodeParams(long nodeId) {
    put("nodeId", nodeId);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.CONSOLE + ".addInspectedNode";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}