// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

public class AddScriptToEvaluateOnLoadParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputpage.AddScriptToEvaluateOnLoadData> {
  public AddScriptToEvaluateOnLoadParams(String scriptSource) {
    this.put("scriptSource", scriptSource);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".addScriptToEvaluateOnLoad";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputpage.AddScriptToEvaluateOnLoadData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parsePageAddScriptToEvaluateOnLoadData(data.getUnderlyingObject());
  }

}
