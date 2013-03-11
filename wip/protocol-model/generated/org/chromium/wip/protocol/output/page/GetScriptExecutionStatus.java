// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Determines if scripts can be executed in the page.
 */
public final class GetScriptExecutionStatus extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.getScriptExecutionStatus";
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parsePageGetScriptExecutionStatusData(data.getDeferredReader());
  }
}