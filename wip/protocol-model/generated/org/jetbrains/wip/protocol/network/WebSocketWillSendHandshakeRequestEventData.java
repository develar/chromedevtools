// Generated source
package org.jetbrains.wip.protocol.network;

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
  org.jetbrains.wip.protocol.network.WebSocketRequestValue request();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData>("NetworkwebSocketWillSendHandshakeRequest", org.jetbrains.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkWebSocketWillSendHandshakeRequestEventData(reader);
    }
  };
}