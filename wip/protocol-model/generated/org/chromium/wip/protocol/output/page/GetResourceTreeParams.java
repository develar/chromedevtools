// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Returns present frame / resource tree structure.
 */
public class GetResourceTreeParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.GetResourceTreeData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".getResourceTree";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetResourceTreeData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageGetResourceTreeData(data.getUnderlyingObject());
  }
}