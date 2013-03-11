// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Sets JavaScript breakpoint at a given location.
 */
public final class SetBreakpoint extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.debugger.SetBreakpointData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
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
  public org.chromium.wip.protocol.input.debugger.SetBreakpointData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readDebuggerSetBreakpointData(data.getDeferredReader());
  }
}