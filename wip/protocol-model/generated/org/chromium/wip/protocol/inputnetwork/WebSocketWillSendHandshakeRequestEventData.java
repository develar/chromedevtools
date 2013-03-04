// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when WebSocket is about to initiate handshake.
 */
@org.chromium.protocolParser.JsonType
public interface WebSocketWillSendHandshakeRequestEventData {
  /**
   Request identifier.
   */
  String requestId();

  /**
   Timestamp.
   */
  Number timestamp();

  /**
   WebSocket request data.
   */
  org.chromium.wip.protocol.inputnetwork.WebSocketRequestValue request();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData>("NetworkwebSocketWillSendHandshakeRequest", org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseNetworkWebSocketWillSendHandshakeRequestEventData(reader);
    }
  };
}
