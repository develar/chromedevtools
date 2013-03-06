// Generated source
package org.chromium.wip.protocol.input.network;

/**
 * Fired when WebSocket frame is sent.
 */
@org.chromium.protocolParser.JsonType
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
  org.chromium.wip.protocol.input.network.WebSocketFrameValue response();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketFrameSentEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketFrameSentEventData>("NetworkwebSocketFrameSent", org.chromium.wip.protocol.input.network.WebSocketFrameSentEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.WebSocketFrameSentEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkWebSocketFrameSentEventData(reader);
    }
  };
}