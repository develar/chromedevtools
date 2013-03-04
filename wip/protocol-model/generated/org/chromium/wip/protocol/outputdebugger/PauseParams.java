// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Stops on the next JavaScript statement.
 */
public class PauseParams extends org.jetbrains.wip.protocol.WipParams {
  public PauseParams() {
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".pause";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
