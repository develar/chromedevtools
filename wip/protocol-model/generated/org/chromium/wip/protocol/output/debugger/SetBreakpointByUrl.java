// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
 */
public final class SetBreakpointByUrl extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.SetBreakpointByUrlData> {
  /**
   * @param lineNumber Line number to set breakpoint at.
   */
  public SetBreakpointByUrl(int lineNumber) {
    writeInt("lineNumber", lineNumber);
  }

  /**
   * @param v URL of the resources to set breakpoint on.
   */
  public SetBreakpointByUrl url(String v) {
    if (v != null) {
      writeString("url", v);
    }
    return this;
  }

  /**
   * @param v Regex pattern for the URLs of the resources to set breakpoints on. Either <code>url</code> or <code>urlRegex</code> must be specified.
   */
  public SetBreakpointByUrl urlRegex(String v) {
    if (v != null) {
      writeString("urlRegex", v);
    }
    return this;
  }

  /**
   * @param v Offset in the line to set breakpoint at.
   */
  public SetBreakpointByUrl columnNumber(int v) {
    if (v != -1) {
      writeInt("columnNumber", v);
    }
    return this;
  }

  /**
   * @param v Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
   */
  public SetBreakpointByUrl condition(String v) {
    if (v != null) {
      writeString("condition", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "Debugger.setBreakpointByUrl";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SetBreakpointByUrlData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerSetBreakpointByUrlData(data.getDeferredReader());
  }
}