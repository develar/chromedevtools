// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Tells whether enabling debugger causes scripts recompilation.
 */
public final class CausesRecompilation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.debugger.CausesRecompilationResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Debugger.causesRecompilation";
  }

  @Override
  public CausesRecompilationResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerCausesRecompilationResult(jsonReader);
  }
}