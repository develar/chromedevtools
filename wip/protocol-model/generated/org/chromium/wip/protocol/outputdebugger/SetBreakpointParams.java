// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Sets JavaScript breakpoint at a given location.
 */
public class SetBreakpointParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.SetBreakpointData> {
  /**
   @param location Location to set breakpoint in.
   @param conditionOpt Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
   */
  public SetBreakpointParams(org.chromium.wip.protocol.outputdebugger.LocationParam location, String conditionOpt) {
    this.put("location", location);
    if (conditionOpt != null) {
      this.put("condition", conditionOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setBreakpoint";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.SetBreakpointData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parseDebuggerSetBreakpointData(data.getUnderlyingObject());
  }

}
