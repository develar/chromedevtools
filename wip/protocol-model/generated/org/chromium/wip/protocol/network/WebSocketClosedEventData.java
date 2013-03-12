// Generated source
package org.chromium.wip.protocol.network;

/**
 * Fired when WebSocket is closed.
 */
@org.chromium.protocolReader.JsonType
public interface WebSocketClosedEventData {
  /**
   * Request identifier.
   */
  String requestId();
  /**
   * Timestamp.
   */
  double timestamp();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.WebSocketClosedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.WebSocketClosedEventData>("NetworkwebSocketClosed", org.chromium.wip.protocol.network.WebSocketClosedEventData.class) {
    @Override
    public org.chromium.wip.protocol.network.WebSocketClosedEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkWebSocketClosedEventData(reader);
    }
  };
}