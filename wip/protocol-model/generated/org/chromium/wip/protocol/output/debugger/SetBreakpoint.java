// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Sets JavaScript breakpoint at a given location.
 */
public final class SetBreakpoint extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.SetBreakpointData> {
  /**
   * @param location Location to set breakpoint in.
   */
  public SetBreakpoint(org.chromium.wip.protocol.output.debugger.Location location) {
    writeMessage("location", location);
  }

  /**
   * @param v Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
   */
  public SetBreakpoint condition(String v) {
    if (v != null) {
      writeString("condition", v);
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