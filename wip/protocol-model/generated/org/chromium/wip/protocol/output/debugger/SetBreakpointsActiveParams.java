// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Activates / deactivates all breakpoints on the page.
 */
public class SetBreakpointsActiveParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param active New value for breakpoints active state.
   */
  public SetBreakpointsActiveParams(boolean active) {
    put("active", active);
  }
  @Override
  public String getMethodName() {
    return "Debugger.setBreakpointsActive";
  }
}