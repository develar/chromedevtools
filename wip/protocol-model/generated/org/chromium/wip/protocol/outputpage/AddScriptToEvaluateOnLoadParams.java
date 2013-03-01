// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

public class AddScriptToEvaluateOnLoadParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.wip.protocol.inputpage.AddScriptToEvaluateOnLoadData> {
  public AddScriptToEvaluateOnLoadParams(String scriptSource) {
    this.put("scriptSource", scriptSource);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".addScriptToEvaluateOnLoad";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputpage.AddScriptToEvaluateOnLoadData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parsePageAddScriptToEvaluateOnLoadData(data.getUnderlyingObject());
  }

}
