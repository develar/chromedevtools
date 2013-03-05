// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.debugger;

/**
 * Stops on the next JavaScript statement.
 */
public class PauseParams extends org.jetbrains.wip.protocol.WipParams {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".pause";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}