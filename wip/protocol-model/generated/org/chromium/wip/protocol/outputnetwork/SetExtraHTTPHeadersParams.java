// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputnetwork;

/**
Specifies whether to always send extra HTTP headers with the requests from this page.
 */
public class SetExtraHTTPHeadersParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param headers Map with extra HTTP headers.
   */
  public SetExtraHTTPHeadersParams(org.chromium.wip.protocol.outputnetwork.HeadersParam headers) {
    this.put("headers", headers);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".setExtraHTTPHeaders";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
