// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when WebSocket frame error occurs.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketFrameErrorEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

  /**
   WebSocket frame error message.
   */
  String errorMessage();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData>("NetworkwebSocketFrameError", org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkWebSocketFrameErrorEventData(obj);
    }
  };
}
