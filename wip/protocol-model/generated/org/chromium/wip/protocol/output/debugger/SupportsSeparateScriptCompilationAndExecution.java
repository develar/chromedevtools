// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Tells whether debugger supports separate script compilation and execution.
 */
public final class SupportsSeparateScriptCompilationAndExecution extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.SupportsSeparateScriptCompilationAndExecutionData> {

  @Override
  public String getMethodName() {
    return "Debugger.supportsSeparateScriptCompilationAndExecution";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SupportsSeparateScriptCompilationAndExecutionData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerSupportsSeparateScriptCompilationAndExecutionData(data.getDeferredReader());
  }
}