// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Checks if Geolocation can be overridden.
 */
public final class CanOverrideGeolocation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.CanOverrideGeolocationData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideGeolocation";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideGeolocationData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parsePageCanOverrideGeolocationData(data.getDeferredReader());
  }
}