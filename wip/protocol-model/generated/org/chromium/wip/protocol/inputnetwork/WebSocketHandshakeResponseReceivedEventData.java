// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when WebSocket handshake response becomes available.
 */
@org.chromium.protocolParser.JsonType
public interface WebSocketHandshakeResponseReceivedEventData {
  /**
   Request identifier.
   */
  String requestId();

  /**
   Timestamp.
   */
  Number timestamp();

  /**
   WebSocket response data.
   */
  org.chromium.wip.protocol.inputnetwork.WebSocketResponseValue response();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData>("NetworkwebSocketHandshakeResponseReceived", org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkWebSocketHandshakeResponseReceivedEventData(reader);
    }
  };
}
