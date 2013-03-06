// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Removes JavaScript breakpoint.
 */
public class RemoveBreakpointParams extends org.jetbrains.wip.protocol.WipParams {
  public RemoveBreakpointParams(String breakpointId) {
    put("breakpointId", breakpointId);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".removeBreakpoint";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}