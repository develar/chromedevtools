// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Activates / deactivates all breakpoints on the page.
 */
public final class SetBreakpointsActive extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param active New value for breakpoints active state.
   */
  public SetBreakpointsActive(boolean active) {
    writeBoolean("active", active);
  }
  @Override
  public String getMethodName() {
    return "Debugger.setBreakpointsActive";
  }
}