// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Check the backend if Web Inspector can override the device orientation.
 */
public class CanOverrideDeviceOrientationParams extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.page.CanOverrideDeviceOrientationData> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideDeviceOrientation";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideDeviceOrientationData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanOverrideDeviceOrientationData(data.getDeferredReader());
  }
}