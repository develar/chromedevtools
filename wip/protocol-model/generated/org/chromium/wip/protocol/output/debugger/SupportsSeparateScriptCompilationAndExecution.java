// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Tells whether debugger supports separate script compilation and execution.
 */
public final class SupportsSeparateScriptCompilationAndExecution extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.debugger.SupportsSeparateScriptCompilationAndExecutionData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Debugger.supportsSeparateScriptCompilationAndExecution";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SupportsSeparateScriptCompilationAndExecutionData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDebuggerSupportsSeparateScriptCompilationAndExecutionData(data.getDeferredReader());
  }
}