// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Returns detailed informtation on given function.
 */
public final class GetFunctionDetails extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.debugger.GetFunctionDetailsResult, org.chromium.wip.protocol.ProtocolReponseReader> {
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
  public GetFunctionDetailsResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerGetFunctionDetailsResult(jsonReader);
  }
}