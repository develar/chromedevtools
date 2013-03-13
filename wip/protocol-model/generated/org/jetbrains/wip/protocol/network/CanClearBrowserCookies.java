// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Tells whether clearing browser cookies is supported.
 */
public final class CanClearBrowserCookies extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.network.CanClearBrowserCookiesResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Network.canClearBrowserCookies";
  }

  @Override
  public CanClearBrowserCookiesResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readNetworkCanClearBrowserCookiesResult(jsonReader);
  }
}