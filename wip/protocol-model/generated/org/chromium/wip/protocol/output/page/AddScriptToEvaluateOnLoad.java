// Generated source
package org.chromium.wip.protocol.output.page;

public final class AddScriptToEvaluateOnLoad extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.AddScriptToEvaluateOnLoadData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  public AddScriptToEvaluateOnLoad(String scriptSource) {
    writeString("scriptSource", scriptSource);
  }
  @Override
  public String getMethodName() {
    return "Page.addScriptToEvaluateOnLoad";
  }

  @Override
  public org.chromium.wip.protocol.input.page.AddScriptToEvaluateOnLoadData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readPageAddScriptToEvaluateOnLoadData(data.getDeferredReader());
  }
}