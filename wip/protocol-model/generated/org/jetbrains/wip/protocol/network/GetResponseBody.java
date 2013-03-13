// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Returns content served for the given request.
 */
public final class GetResponseBody extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.network.GetResponseBodyResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
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
  public GetResponseBodyResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readNetworkGetResponseBodyResult(jsonReader);
  }
}