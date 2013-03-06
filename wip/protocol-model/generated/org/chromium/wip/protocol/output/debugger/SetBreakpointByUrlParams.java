// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
 */
public class SetBreakpointByUrlParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.debugger.SetBreakpointByUrlData> {
  /**
   * @param lineNumber Line number to set breakpoint at.
   */
  public SetBreakpointByUrlParams(int lineNumber) {
    put("lineNumber", lineNumber);
  }

  /**
   * @param v URL of the resources to set breakpoint on.
   */
  public SetBreakpointByUrlParams url(String v) {
    if (v != null) {
      put("url", v);
    }
    return this;
  }

  /**
   * @param v Regex pattern for the URLs of the resources to set breakpoints on. Either <code>url</code> or <code>urlRegex</code> must be specified.
   */
  public SetBreakpointByUrlParams urlRegex(String v) {
    if (v != null) {
      put("urlRegex", v);
    }
    return this;
  }

  /**
   * @param v Offset in the line to set breakpoint at.
   */
  public SetBreakpointByUrlParams columnNumber(int v) {
    put("columnNumber", v);
    return this;
  }

  /**
   * @param v Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
   */
  public SetBreakpointByUrlParams condition(String v) {
    if (v != null) {
      put("condition", v);
    }
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setBreakpointByUrl";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SetBreakpointByUrlData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerSetBreakpointByUrlData(data.getUnderlyingObject());
  }
}