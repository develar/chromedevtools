// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputnetwork;

/**
Returns content served for the given request.
 */
public class GetResponseBodyParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.wip.protocol.inputnetwork.GetResponseBodyData> {
  /**
   @param requestId Identifier of the network request to get content for.
   */
  public GetResponseBodyParams(String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId) {
    this.put("requestId", requestId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".getResponseBody";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputnetwork.GetResponseBodyData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseNetworkGetResponseBodyData(data.getUnderlyingObject());
  }

}
