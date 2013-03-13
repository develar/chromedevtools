// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Sets JavaScript breakpoint at a given location.
 */
public final class SetBreakpoint extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.debugger.SetBreakpointResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
  /**
   * @param location Location to set breakpoint in.
   */
  public SetBreakpoint(org.jetbrains.wip.protocol.debugger.Location location) {
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
  public SetBreakpointResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerSetBreakpointResult(jsonReader);
  }
}