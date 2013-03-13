// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Fired when WebSocket handshake response becomes available.
 */
@org.chromium.protocolReader.JsonType
public interface WebSocketHandshakeResponseReceivedEventData {
  /**
   * Request identifier.
   */
  String requestId();
  /**
   * Timestamp.
   */
  double timestamp();
  /**
   * WebSocket response data.
   */
  org.jetbrains.wip.protocol.network.WebSocketResponseValue response();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.WebSocketHandshakeResponseReceivedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.WebSocketHandshakeResponseReceivedEventData>("NetworkwebSocketHandshakeResponseReceived", org.jetbrains.wip.protocol.network.WebSocketHandshakeResponseReceivedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.network.WebSocketHandshakeResponseReceivedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkWebSocketHandshakeResponseReceivedEventData(reader);
    }
  };
}