// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Specifies whether to always send extra HTTP headers with the requests from this page.
 */
public final class SetExtraHTTPHeadersParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param headers Map with extra HTTP headers.
   */
  public SetExtraHTTPHeadersParams(org.chromium.wip.protocol.output.network.HeadersParam headers) {
    put("headers", headers);
  }
  @Override
  public String getMethodName() {
    return "Network.setExtraHTTPHeaders";
  }
}