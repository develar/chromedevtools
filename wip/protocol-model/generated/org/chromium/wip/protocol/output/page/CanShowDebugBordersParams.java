// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Tells if backend supports debug borders on layers
 */
public class CanShowDebugBordersParams extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.page.CanShowDebugBordersData> {

  @Override
  public String getMethodName() {
    return "Page.canShowDebugBorders";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanShowDebugBordersData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanShowDebugBordersData(data.getDeferredReader());
  }
}