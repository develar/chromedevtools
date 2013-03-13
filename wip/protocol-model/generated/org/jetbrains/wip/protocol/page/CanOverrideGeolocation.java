// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Checks if Geolocation can be overridden.
 */
public final class CanOverrideGeolocation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.page.CanOverrideGeolocationResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideGeolocation";
  }

  @Override
  public CanOverrideGeolocationResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCanOverrideGeolocationResult(jsonReader);
  }
}