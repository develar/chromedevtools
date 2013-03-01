// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when WebSocket frame is received.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketFrameReceivedEventData {
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

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData>("NetworkwebSocketFrameReceived", org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkWebSocketFrameReceivedEventData(obj);
    }
  };
}
