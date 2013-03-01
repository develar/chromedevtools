// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when WebSocket handshake response becomes available.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketHandshakeResponseReceivedEventData {
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
  org.chromium.wip.protocol.inputnetwork.WebSocketResponseValue response();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData>("NetworkwebSocketHandshakeResponseReceived", org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkWebSocketHandshakeResponseReceivedEventData(obj);
    }
  };
}
