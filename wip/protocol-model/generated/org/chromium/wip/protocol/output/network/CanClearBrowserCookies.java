// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Tells whether clearing browser cookies is supported.
 */
public final class CanClearBrowserCookies extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.network.CanClearBrowserCookiesData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Network.canClearBrowserCookies";
  }

  @Override
  public org.chromium.wip.protocol.input.network.CanClearBrowserCookiesData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readNetworkCanClearBrowserCookiesData(data.getDeferredReader());
  }
}