// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Tells whether enabling debugger causes scripts recompilation.
 */
public class CausesRecompilationParams extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.CausesRecompilationData> {

  @Override
  public String getMethodName() {
    return "Debugger.causesRecompilation";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.CausesRecompilationData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerCausesRecompilationData(data.getDeferredReader());
  }
}