// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Indicates the visibility of compositing borders.
 */
public class GetCompositingBordersVisibleParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.GetCompositingBordersVisibleData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".getCompositingBordersVisible";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetCompositingBordersVisibleData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageGetCompositingBordersVisibleData(data.getUnderlyingObject());
  }
}