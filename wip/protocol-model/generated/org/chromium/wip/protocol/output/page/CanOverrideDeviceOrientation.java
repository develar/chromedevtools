// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Check the backend if Web Inspector can override the device orientation.
 */
public final class CanOverrideDeviceOrientation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.CanOverrideDeviceOrientationData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideDeviceOrientation";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideDeviceOrientationData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parsePageCanOverrideDeviceOrientationData(data.getDeferredReader());
  }
}