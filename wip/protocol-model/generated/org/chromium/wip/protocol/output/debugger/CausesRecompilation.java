// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Tells whether enabling debugger causes scripts recompilation.
 */
public final class CausesRecompilation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.debugger.CausesRecompilationData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Debugger.causesRecompilation";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.CausesRecompilationData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDebuggerCausesRecompilationData(data.getDeferredReader());
  }
}