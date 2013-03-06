// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Returns content of the given resource.
 */
public class GetResourceContentParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.GetResourceContentData> {
  /**
   * @param frameId Frame id to get resource for.
   * @param url URL of the resource to get content for.
   */
  public GetResourceContentParams(String frameId, String url) {
    put("frameId", frameId);
    put("url", url);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".getResourceContent";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetResourceContentData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageGetResourceContentData(data.getUnderlyingObject());
  }
}