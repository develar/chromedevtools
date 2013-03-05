// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.network;

/**
 Fired when WebSocket frame is received.
 */
@org.chromium.protocolParser.JsonType
public interface WebSocketFrameReceivedEventData {
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
  org.chromium.wip.protocol.input.network.WebSocketFrameValue response();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData>("NetworkwebSocketFrameReceived", org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData.class) {
    @Override public org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkWebSocketFrameReceivedEventData(reader);
    }
  };
}
