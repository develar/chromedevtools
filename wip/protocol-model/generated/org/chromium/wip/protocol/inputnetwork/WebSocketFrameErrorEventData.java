// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when WebSocket frame error occurs.
 */
@org.chromium.protocolParser.JsonType
public interface WebSocketFrameErrorEventData {
  /**
   Request identifier.
   */
  String requestId();

  /**
   Timestamp.
   */
  Number timestamp();

  /**
   WebSocket frame error message.
   */
  String errorMessage();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData>("NetworkwebSocketFrameError", org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseNetworkWebSocketFrameErrorEventData(reader);
    }
  };
}
