// Generated source
package org.chromium.wip.protocol.input.network;

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
  org.chromium.wip.protocol.input.network.WebSocketRequestValue request();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData>("NetworkwebSocketWillSendHandshakeRequest", org.chromium.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkWebSocketWillSendHandshakeRequestEventData(reader);
    }
  };
}