// Generated source
package org.chromium.wip.protocol.page;

/**
 * Checks if Geolocation can be overridden.
 */
public final class CanOverrideGeolocation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.CanOverrideGeolocationResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideGeolocation";
  }

  @Override
  public CanOverrideGeolocationResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCanOverrideGeolocationResult(jsonReader);
  }
}