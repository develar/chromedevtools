// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputnetwork;

/**
Returns content served for the given request.
 */
public class GetResponseBodyParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputnetwork.GetResponseBodyData> {
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

  @Override public org.chromium.wip.protocol.inputnetwork.GetResponseBodyData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parseNetworkGetResponseBodyData(data.getUnderlyingObject());
  }

}
