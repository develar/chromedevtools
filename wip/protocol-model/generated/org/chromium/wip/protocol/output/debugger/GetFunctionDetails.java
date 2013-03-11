// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Returns detailed informtation on given function.
 */
public final class GetFunctionDetails extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.debugger.GetFunctionDetailsData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param functionId Id of the function to get location for.
   */
  public GetFunctionDetails(String functionId) {
    writeString("functionId", functionId);
  }
  @Override
  public String getMethodName() {
    return "Debugger.getFunctionDetails";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.GetFunctionDetailsData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDebuggerGetFunctionDetailsData(data.getDeferredReader());
  }
}