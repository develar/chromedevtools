// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Tells whether clearing browser cookies is supported.
 */
public class CanClearBrowserCookiesParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.network.CanClearBrowserCookiesData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.NETWORK + ".canClearBrowserCookies";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.network.CanClearBrowserCookiesData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseNetworkCanClearBrowserCookiesData(data.getUnderlyingObject());
  }
}