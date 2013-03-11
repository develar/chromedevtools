// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Tells whether <code>setScriptSource</code> is supported.
 */
public final class CanSetScriptSource extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.debugger.CanSetScriptSourceData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Debugger.canSetScriptSource";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.CanSetScriptSourceData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readDebuggerCanSetScriptSourceData(data.getDeferredReader());
  }
}