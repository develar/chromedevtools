// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Fired when WebSocket frame error occurs.
 */
@org.chromium.protocolReader.JsonType
public interface WebSocketFrameErrorEventData {
  /**
   * Request identifier.
   */
  String requestId();
  /**
   * Timestamp.
   */
  double timestamp();
  /**
   * WebSocket frame error message.
   */
  String errorMessage();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.WebSocketFrameErrorEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.WebSocketFrameErrorEventData>("NetworkwebSocketFrameError", org.jetbrains.wip.protocol.network.WebSocketFrameErrorEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.network.WebSocketFrameErrorEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkWebSocketFrameErrorEventData(reader);
    }
  };
}