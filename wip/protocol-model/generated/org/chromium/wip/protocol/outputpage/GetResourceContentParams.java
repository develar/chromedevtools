// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Returns content of the given resource.
 */
public class GetResourceContentParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.wip.protocol.inputpage.GetResourceContentData> {
  /**
   @param frameId Frame id to get resource for.
   @param url URL of the resource to get content for.
   */
  public GetResourceContentParams(String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId, String url) {
    this.put("frameId", frameId);
    this.put("url", url);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".getResourceContent";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputpage.GetResourceContentData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parsePageGetResourceContentData(data.getUnderlyingObject());
  }

}
