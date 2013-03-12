// Generated source
package org.chromium.wip.protocol.network;

/**
 * Tells whether clearing browser cookies is supported.
 */
public final class CanClearBrowserCookies extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.network.CanClearBrowserCookiesResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Network.canClearBrowserCookies";
  }

  @Override
  public CanClearBrowserCookiesResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readNetworkCanClearBrowserCookiesResult(jsonReader);
  }
}