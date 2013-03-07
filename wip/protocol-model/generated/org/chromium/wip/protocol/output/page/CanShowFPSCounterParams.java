// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Tells if backend supports a FPS counter display
 */
public class CanShowFPSCounterParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.CanShowFPSCounterData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".canShowFPSCounter";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanShowFPSCounterData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanShowFPSCounterData(data.getDeferredReader());
  }
}