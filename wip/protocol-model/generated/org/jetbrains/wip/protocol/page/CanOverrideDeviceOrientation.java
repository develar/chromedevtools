// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Check the backend if Web Inspector can override the device orientation.
 */
public final class CanOverrideDeviceOrientation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.page.CanOverrideDeviceOrientationResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideDeviceOrientation";
  }

  @Override
  public CanOverrideDeviceOrientationResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCanOverrideDeviceOrientationResult(jsonReader);
  }
}