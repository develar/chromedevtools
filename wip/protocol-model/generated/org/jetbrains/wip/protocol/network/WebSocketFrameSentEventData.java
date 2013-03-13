// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Fired when WebSocket frame is sent.
 */
@org.chromium.protocolReader.JsonType
public interface WebSocketFrameSentEventData {
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
  org.jetbrains.wip.protocol.network.WebSocketFrameValue response();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.WebSocketFrameSentEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.WebSocketFrameSentEventData>("NetworkwebSocketFrameSent", org.jetbrains.wip.protocol.network.WebSocketFrameSentEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.network.WebSocketFrameSentEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkWebSocketFrameSentEventData(reader);
    }
  };
}