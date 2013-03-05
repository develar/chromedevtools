// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.network;

/**
Returns content served for the given request.
 */
public class GetResponseBodyParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.network.GetResponseBodyData> {
  /**
   @param requestId Identifier of the network request to get content for.
   */
  public GetResponseBodyParams(String requestId) {
    //this.put("requestId", requestId);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.NETWORK + ".getResponseBody";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.input.network.GetResponseBodyData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseNetworkGetResponseBodyData(data.getUnderlyingObject());
  }

}
