// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Removes JavaScript breakpoint.
 */
public final class RemoveBreakpointParams extends org.jetbrains.wip.WipRequest {
  public RemoveBreakpointParams(String breakpointId) {
    put("breakpointId", breakpointId);
  }
  @Override
  public String getMethodName() {
    return "Debugger.removeBreakpoint";
  }
}