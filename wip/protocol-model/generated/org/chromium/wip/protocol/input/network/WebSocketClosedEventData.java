// Generated source
package org.chromium.wip.protocol.input.network;

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

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketClosedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketClosedEventData>("NetworkwebSocketClosed", org.chromium.wip.protocol.input.network.WebSocketClosedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.WebSocketClosedEventData parse(org.chromium.wip.protocol.input.ProtocolReponseReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseNetworkWebSocketClosedEventData(reader);
    }
  };
}