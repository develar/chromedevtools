// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputnetwork;

/**
Tells whether clearing browser cookies is supported.
 */
public class CanClearBrowserCookiesParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.wip.protocol.inputnetwork.CanClearBrowserCookiesData> {
  public CanClearBrowserCookiesParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".canClearBrowserCookies";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputnetwork.CanClearBrowserCookiesData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseNetworkCanClearBrowserCookiesData(data.getUnderlyingObject());
  }

}
