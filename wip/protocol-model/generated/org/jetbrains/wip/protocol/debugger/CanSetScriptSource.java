// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Tells whether <code>setScriptSource</code> is supported.
 */
public final class CanSetScriptSource extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.debugger.CanSetScriptSourceResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Debugger.canSetScriptSource";
  }

  @Override
  public CanSetScriptSourceResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerCanSetScriptSourceResult(jsonReader);
  }
}