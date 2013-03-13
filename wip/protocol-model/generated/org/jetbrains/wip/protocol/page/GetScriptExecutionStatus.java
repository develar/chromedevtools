// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Determines if scripts can be executed in the page.
 */
public final class GetScriptExecutionStatus extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.page.GetScriptExecutionStatusResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.getScriptExecutionStatus";
  }

  @Override
  public GetScriptExecutionStatusResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageGetScriptExecutionStatusResult(jsonReader);
  }
}