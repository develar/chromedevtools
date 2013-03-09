// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Tells whether clearing browser cookies is supported.
 */
public final class CanClearBrowserCookies extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.network.CanClearBrowserCookiesData> {

  @Override
  public String getMethodName() {
    return "Network.canClearBrowserCookies";
  }

  @Override
  public org.chromium.wip.protocol.input.network.CanClearBrowserCookiesData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseNetworkCanClearBrowserCookiesData(data.getDeferredReader());
  }
}