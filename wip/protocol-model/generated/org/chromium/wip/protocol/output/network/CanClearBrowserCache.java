// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Tells whether clearing browser cache is supported.
 */
public final class CanClearBrowserCache extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.network.CanClearBrowserCacheData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Network.canClearBrowserCache";
  }

  @Override
  public org.chromium.wip.protocol.input.network.CanClearBrowserCacheData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseNetworkCanClearBrowserCacheData(data.getDeferredReader());
  }
}