// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Removes JavaScript breakpoint.
 */
public final class RemoveBreakpoint extends org.jetbrains.wip.protocol.WipRequest {
  public RemoveBreakpoint(String breakpointId) {
    writeString("breakpointId", breakpointId);
  }
  @Override
  public String getMethodName() {
    return "Debugger.removeBreakpoint";
  }
}