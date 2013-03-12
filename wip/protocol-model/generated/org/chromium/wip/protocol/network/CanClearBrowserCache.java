// Generated source
package org.chromium.wip.protocol.network;

/**
 * Tells whether clearing browser cache is supported.
 */
public final class CanClearBrowserCache extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.network.CanClearBrowserCacheResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Network.canClearBrowserCache";
  }

  @Override
  public CanClearBrowserCacheResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readNetworkCanClearBrowserCacheResult(jsonReader);
  }
}