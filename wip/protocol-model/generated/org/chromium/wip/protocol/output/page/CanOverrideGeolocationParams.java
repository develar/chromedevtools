// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Checks if Geolocation can be overridden.
 */
public class CanOverrideGeolocationParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.CanOverrideGeolocationData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".canOverrideGeolocation";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideGeolocationData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanOverrideGeolocationData(data.getDeferredReader());
  }
}