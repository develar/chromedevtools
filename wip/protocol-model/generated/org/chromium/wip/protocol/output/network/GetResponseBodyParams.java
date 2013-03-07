// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Returns content served for the given request.
 */
public class GetResponseBodyParams extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.network.GetResponseBodyData> {
  /**
   * @param requestId Identifier of the network request to get content for.
   */
  public GetResponseBodyParams(String requestId) {
    put("requestId", requestId);
  }
  @Override
  public String getMethodName() {
    return "Network.getResponseBody";
  }

  @Override
  public org.chromium.wip.protocol.input.network.GetResponseBodyData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseNetworkGetResponseBodyData(data.getDeferredReader());
  }
}