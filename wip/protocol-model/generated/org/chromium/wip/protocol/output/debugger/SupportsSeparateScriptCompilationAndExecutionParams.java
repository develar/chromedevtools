// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.debugger;

/**
Tells whether debugger supports separate script compilation and execution.
 */
public class SupportsSeparateScriptCompilationAndExecutionParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.debugger.SupportsSeparateScriptCompilationAndExecutionData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".supportsSeparateScriptCompilationAndExecution";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SupportsSeparateScriptCompilationAndExecutionData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerSupportsSeparateScriptCompilationAndExecutionData(data.getUnderlyingObject());
  }

}