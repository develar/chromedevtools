// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Determines if scripts can be executed in the page.
 */
public class GetScriptExecutionStatusParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".getScriptExecutionStatus";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageGetScriptExecutionStatusData(data.getUnderlyingObject());
  }
}