// Generated source
package org.chromium.wip.protocol.network;

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

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.WebSocketFrameErrorEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.WebSocketFrameErrorEventData>("NetworkwebSocketFrameError", org.chromium.wip.protocol.network.WebSocketFrameErrorEventData.class) {
    @Override
    public org.chromium.wip.protocol.network.WebSocketFrameErrorEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkWebSocketFrameErrorEventData(reader);
    }
  };
}