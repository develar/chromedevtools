// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.debugger;

/**
 * Activates / deactivates all breakpoints on the page.
 */
public class SetBreakpointsActiveParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param active New value for breakpoints active state.
   */
  public SetBreakpointsActiveParams(boolean active) {
    put("active", active);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setBreakpointsActive";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}