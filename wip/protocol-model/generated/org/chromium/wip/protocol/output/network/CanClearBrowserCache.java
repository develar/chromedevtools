// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Tells whether clearing browser cache is supported.
 */
public final class CanClearBrowserCache extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.network.CanClearBrowserCacheData> {

  @Override
  public String getMethodName() {
    return "Network.canClearBrowserCache";
  }

  @Override
  public org.chromium.wip.protocol.input.network.CanClearBrowserCacheData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseNetworkCanClearBrowserCacheData(data.getDeferredReader());
  }
}