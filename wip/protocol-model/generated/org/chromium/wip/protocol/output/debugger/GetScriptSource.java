// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Returns source for the script with given id.
 */
public final class GetScriptSource extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.debugger.GetScriptSourceData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param scriptId Id of the script to get source for.
   */
  public GetScriptSource(String scriptId) {
    writeString("scriptId", scriptId);
  }
  @Override
  public String getMethodName() {
    return "Debugger.getScriptSource";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.GetScriptSourceData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDebuggerGetScriptSourceData(data.getDeferredReader());
  }
}