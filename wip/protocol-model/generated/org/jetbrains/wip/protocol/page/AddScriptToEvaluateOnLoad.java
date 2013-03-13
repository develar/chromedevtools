// Generated source
package org.jetbrains.wip.protocol.page;

public final class AddScriptToEvaluateOnLoad extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.page.AddScriptToEvaluateOnLoadResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
  public AddScriptToEvaluateOnLoad(String scriptSource) {
    writeString("scriptSource", scriptSource);
  }
  @Override
  public String getMethodName() {
    return "Page.addScriptToEvaluateOnLoad";
  }

  @Override
  public AddScriptToEvaluateOnLoadResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageAddScriptToEvaluateOnLoadResult(jsonReader);
  }
}