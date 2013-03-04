// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when WebSocket frame is sent.
 */
@org.chromium.protocolParser.JsonType
public interface WebSocketFrameSentEventData {
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

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData>("NetworkwebSocketFrameSent", org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseNetworkWebSocketFrameSentEventData(reader);
    }
  };
}
