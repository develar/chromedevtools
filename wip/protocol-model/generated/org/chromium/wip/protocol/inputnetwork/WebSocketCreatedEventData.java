// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired upon WebSocket creation.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketCreatedEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  /**
   WebSocket request URL.
   */
  String url();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData>("NetworkwebSocketCreated", org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkWebSocketCreatedEventData(obj);
    }
  };
}
