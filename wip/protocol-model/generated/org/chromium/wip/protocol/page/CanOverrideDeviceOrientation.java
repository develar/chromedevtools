// Generated source
package org.chromium.wip.protocol.page;

/**
 * Check the backend if Web Inspector can override the device orientation.
 */
public final class CanOverrideDeviceOrientation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.CanOverrideDeviceOrientationResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideDeviceOrientation";
  }

  @Override
  public CanOverrideDeviceOrientationResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCanOverrideDeviceOrientationResult(jsonReader);
  }
}