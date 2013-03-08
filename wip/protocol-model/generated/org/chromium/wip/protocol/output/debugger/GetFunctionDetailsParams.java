// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Returns detailed informtation on given function.
 */
public final class GetFunctionDetailsParams extends org.jetbrains.wip.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.GetFunctionDetailsData> {
  /**
   * @param functionId Id of the function to get location for.
   */
  public GetFunctionDetailsParams(String functionId) {
    put("functionId", functionId);
  }
  @Override
  public String getMethodName() {
    return "Debugger.getFunctionDetails";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.GetFunctionDetailsData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerGetFunctionDetailsData(data.getDeferredReader());
  }
}