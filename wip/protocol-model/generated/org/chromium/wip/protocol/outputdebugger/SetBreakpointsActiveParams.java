// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Activates / deactivates all breakpoints on the page.
 */
public class SetBreakpointsActiveParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param active New value for breakpoints active state.
   */
  public SetBreakpointsActiveParams(boolean active) {
    this.put("active", active);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setBreakpointsActive";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
