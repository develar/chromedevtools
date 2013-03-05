// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

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
  org.chromium.wip.protocol.inputnetwork.WebSocketFrameValue response();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData>("NetworkwebSocketFrameReceived", org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkWebSocketFrameReceivedEventData(reader);
    }
  };
}
