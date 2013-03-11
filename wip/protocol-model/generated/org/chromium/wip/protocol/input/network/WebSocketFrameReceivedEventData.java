// Generated source
package org.chromium.wip.protocol.input.network;

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
  org.chromium.wip.protocol.input.network.WebSocketFrameValue response();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData>("NetworkwebSocketFrameReceived", org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkWebSocketFrameReceivedEventData(reader);
    }
  };
}