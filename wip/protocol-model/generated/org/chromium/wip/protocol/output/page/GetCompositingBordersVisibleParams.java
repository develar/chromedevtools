// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Indicates the visibility of compositing borders.
 */
public class GetCompositingBordersVisibleParams extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.page.GetCompositingBordersVisibleData> {

  @Override
  public String getMethodName() {
    return "Page.getCompositingBordersVisible";
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetCompositingBordersVisibleData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageGetCompositingBordersVisibleData(data.getDeferredReader());
  }
}