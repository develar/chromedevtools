// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Fired when WebSocket frame is received.
 */
@org.chromium.protocolReader.JsonType
public interface WebSocketFrameReceivedEventData {
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

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.WebSocketFrameReceivedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.WebSocketFrameReceivedEventData>("NetworkwebSocketFrameReceived", org.jetbrains.wip.protocol.network.WebSocketFrameReceivedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.network.WebSocketFrameReceivedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkWebSocketFrameReceivedEventData(reader);
    }
  };
}