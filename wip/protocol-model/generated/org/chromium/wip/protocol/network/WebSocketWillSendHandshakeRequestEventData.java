// Generated source
package org.chromium.wip.protocol.network;

/**
 * Fired when WebSocket is about to initiate handshake.
 */
@org.chromium.protocolReader.JsonType
public interface WebSocketWillSendHandshakeRequestEventData {
  /**
   * Request identifier.
   */
  String requestId();
  /**
   * Timestamp.
   */
  double timestamp();
  /**
   * WebSocket request data.
   */
  org.chromium.wip.protocol.network.WebSocketRequestValue request();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData>("NetworkwebSocketWillSendHandshakeRequest", org.chromium.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData.class) {
    @Override
    public org.chromium.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkWebSocketWillSendHandshakeRequestEventData(reader);
    }
  };
}