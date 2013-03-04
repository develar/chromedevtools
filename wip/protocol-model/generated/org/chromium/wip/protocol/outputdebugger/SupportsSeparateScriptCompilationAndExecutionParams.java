// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Tells whether debugger supports separate script compilation and execution.
 */
public class SupportsSeparateScriptCompilationAndExecutionParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.SupportsSeparateScriptCompilationAndExecutionData> {
  public SupportsSeparateScriptCompilationAndExecutionParams() {
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".supportsSeparateScriptCompilationAndExecution";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.SupportsSeparateScriptCompilationAndExecutionData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.WipGeneratedParserRoot parser) {
    return parser.parseDebuggerSupportsSeparateScriptCompilationAndExecutionData(data.getUnderlyingObject());
  }

}
