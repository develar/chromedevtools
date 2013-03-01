// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when WebSocket frame is sent.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketFrameSentEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

  /**
   WebSocket response data.
   */
  org.chromium.wip.protocol.inputnetwork.WebSocketFrameValue response();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData>("NetworkwebSocketFrameSent", org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkWebSocketFrameSentEventData(obj);
    }
  };
}
