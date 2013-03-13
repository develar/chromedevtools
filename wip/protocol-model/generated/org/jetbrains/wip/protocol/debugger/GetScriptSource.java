// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Returns source for the script with given id.
 */
public final class GetScriptSource extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.debugger.GetScriptSourceResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
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
  public GetScriptSourceResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerGetScriptSourceResult(jsonReader);
  }
}