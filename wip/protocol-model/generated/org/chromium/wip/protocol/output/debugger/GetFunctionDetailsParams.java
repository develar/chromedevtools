// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Returns detailed informtation on given function.
 */
public class GetFunctionDetailsParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.debugger.GetFunctionDetailsData> {
  /**
   * @param functionId Id of the function to get location for.
   */
  public GetFunctionDetailsParams(String functionId) {
    put("functionId", functionId);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".getFunctionDetails";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.GetFunctionDetailsData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerGetFunctionDetailsData(data.getUnderlyingObject());
  }
}