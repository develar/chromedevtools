// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Steps out of the function call.
 */
public class StepOutParams extends org.jetbrains.wip.protocol.WipParams {
  public StepOutParams() {
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".stepOut";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
