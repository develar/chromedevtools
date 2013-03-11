// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Returns content served for the given request.
 */
public final class GetResponseBody extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.network.GetResponseBodyData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param requestId Identifier of the network request to get content for.
   */
  public GetResponseBody(String requestId) {
    writeString("requestId", requestId);
  }
  @Override
  public String getMethodName() {
    return "Network.getResponseBody";
  }

  @Override
  public org.chromium.wip.protocol.input.network.GetResponseBodyData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseNetworkGetResponseBodyData(data.getDeferredReader());
  }
}