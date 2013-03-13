// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Tells whether clearing browser cache is supported.
 */
public final class CanClearBrowserCache extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.network.CanClearBrowserCacheResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Network.canClearBrowserCache";
  }

  @Override
  public CanClearBrowserCacheResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readNetworkCanClearBrowserCacheResult(jsonReader);
  }
}