// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Check the backend if Web Inspector can override the device orientation.
 */
public class CanOverrideDeviceOrientationParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.CanOverrideDeviceOrientationData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".canOverrideDeviceOrientation";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideDeviceOrientationData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanOverrideDeviceOrientationData(data.getDeferredReader());
  }
}