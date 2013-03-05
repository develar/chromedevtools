// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Returns detailed informtation on given function.
 */
public class GetFunctionDetailsParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.GetFunctionDetailsData> {
  /**
   @param functionId Id of the function to get location for.
   */
  public GetFunctionDetailsParams(String functionId) {
    //this.put("functionId", functionId);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".getFunctionDetails";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.GetFunctionDetailsData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerGetFunctionDetailsData(data.getUnderlyingObject());
  }

}
