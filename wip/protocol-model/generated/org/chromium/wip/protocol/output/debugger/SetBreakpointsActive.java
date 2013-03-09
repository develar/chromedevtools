// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Activates / deactivates all breakpoints on the page.
 */
public final class SetBreakpointsActive extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param active New value for breakpoints active state.
   */
  public SetBreakpointsActive(boolean active) {
    put("active", active);
  }
  @Override
  public String getMethodName() {
    return "Debugger.setBreakpointsActive";
  }
}