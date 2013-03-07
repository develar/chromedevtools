// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Removes JavaScript breakpoint.
 */
public class RemoveBreakpointParams extends org.jetbrains.wip.protocol.WipRequest {
  public RemoveBreakpointParams(String breakpointId) {
    put("breakpointId", breakpointId);
  }
  @Override
  public String getMethodName() {
    return "Debugger.removeBreakpoint";
  }
}