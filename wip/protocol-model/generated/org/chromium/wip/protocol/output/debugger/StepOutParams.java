// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Steps out of the function call.
 */
public class StepOutParams extends org.jetbrains.wip.protocol.WipParams {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".stepOut";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}