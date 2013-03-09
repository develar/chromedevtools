// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Checks if Geolocation can be overridden.
 */
public final class CanOverrideGeolocation extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.page.CanOverrideGeolocationData> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideGeolocation";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideGeolocationData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanOverrideGeolocationData(data.getDeferredReader());
  }
}