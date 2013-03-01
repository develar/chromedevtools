// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when WebSocket is closed.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketClosedEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketClosedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketClosedEventData>("NetworkwebSocketClosed", org.chromium.wip.protocol.inputnetwork.WebSocketClosedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketClosedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkWebSocketClosedEventData(obj);
    }
  };
}
