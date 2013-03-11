// Generated source
package org.chromium.wip.protocol.input.network;

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
  org.chromium.wip.protocol.input.network.WebSocketResponseValue response();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketHandshakeResponseReceivedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketHandshakeResponseReceivedEventData>("NetworkwebSocketHandshakeResponseReceived", org.chromium.wip.protocol.input.network.WebSocketHandshakeResponseReceivedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.WebSocketHandshakeResponseReceivedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseNetworkWebSocketHandshakeResponseReceivedEventData(reader);
    }
  };
}