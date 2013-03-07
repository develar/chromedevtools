// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Tells whether clearing browser cache is supported.
 */
public class CanClearBrowserCacheParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.network.CanClearBrowserCacheData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.NETWORK + ".canClearBrowserCache";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.network.CanClearBrowserCacheData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseNetworkCanClearBrowserCacheData(data.getDeferredReader());
  }
}