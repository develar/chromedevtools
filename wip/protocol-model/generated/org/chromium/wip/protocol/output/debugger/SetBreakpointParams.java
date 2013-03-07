// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Sets JavaScript breakpoint at a given location.
 */
public class SetBreakpointParams extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.SetBreakpointData> {
  /**
   * @param location Location to set breakpoint in.
   */
  public SetBreakpointParams(org.chromium.wip.protocol.output.debugger.LocationParam location) {
    put("location", location);
  }

  /**
   * @param v Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
   */
  public SetBreakpointParams condition(String v) {
    if (v != null) {
      put("condition", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "Debugger.setBreakpoint";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SetBreakpointData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerSetBreakpointData(data.getDeferredReader());
  }
}