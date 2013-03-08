// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Tells if backend supports a FPS counter display
 */
public final class CanShowFPSCounterParams extends org.jetbrains.wip.WipRequestWithResponse<org.chromium.wip.protocol.input.page.CanShowFPSCounterData> {

  @Override
  public String getMethodName() {
    return "Page.canShowFPSCounter";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanShowFPSCounterData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanShowFPSCounterData(data.getDeferredReader());
  }
}