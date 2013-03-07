// Generated source
package org.chromium.wip.protocol.output.page;

public class AddScriptToEvaluateOnLoadParams extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.page.AddScriptToEvaluateOnLoadData> {
  public AddScriptToEvaluateOnLoadParams(String scriptSource) {
    put("scriptSource", scriptSource);
  }
  @Override
  public String getMethodName() {
    return "Page.addScriptToEvaluateOnLoad";
  }

  @Override
  public org.chromium.wip.protocol.input.page.AddScriptToEvaluateOnLoadData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageAddScriptToEvaluateOnLoadData(data.getDeferredReader());
  }
}