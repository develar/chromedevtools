// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when WebSocket is about to initiate handshake.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketWillSendHandshakeRequestEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

  /**
   WebSocket request data.
   */
  org.chromium.wip.protocol.inputnetwork.WebSocketRequestValue request();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData>("NetworkwebSocketWillSendHandshakeRequest", org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkWebSocketWillSendHandshakeRequestEventData(obj);
    }
  };
}
