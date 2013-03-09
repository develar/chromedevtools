// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Determines if scripts can be executed in the page.
 */
public final class GetScriptExecutionStatus extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData> {

  @Override
  public String getMethodName() {
    return "Page.getScriptExecutionStatus";
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageGetScriptExecutionStatusData(data.getDeferredReader());
  }
}