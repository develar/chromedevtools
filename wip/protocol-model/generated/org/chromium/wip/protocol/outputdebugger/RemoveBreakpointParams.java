// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Removes JavaScript breakpoint.
 */
public class RemoveBreakpointParams extends org.jetbrains.wip.protocol.WipParams {
  public RemoveBreakpointParams(String/*See org.chromium.wip.protocol.commondebugger.BreakpointIdTypedef*/ breakpointId) {
    this.put("breakpointId", breakpointId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".removeBreakpoint";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
