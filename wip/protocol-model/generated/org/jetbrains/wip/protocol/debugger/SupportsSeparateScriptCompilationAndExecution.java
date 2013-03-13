// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Tells whether debugger supports separate script compilation and execution.
 */
public final class SupportsSeparateScriptCompilationAndExecution extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.debugger.SupportsSeparateScriptCompilationAndExecutionResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Debugger.supportsSeparateScriptCompilationAndExecution";
  }

  @Override
  public SupportsSeparateScriptCompilationAndExecutionResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerSupportsSeparateScriptCompilationAndExecutionResult(jsonReader);
  }
}