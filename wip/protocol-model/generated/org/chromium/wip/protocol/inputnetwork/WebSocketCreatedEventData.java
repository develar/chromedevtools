// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired upon WebSocket creation.
 */
@org.chromium.protocolParser.JsonType
public interface WebSocketCreatedEventData {
  /**
   Request identifier.
   */
  String requestId();

  /**
   WebSocket request URL.
   */
  String url();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData>("NetworkwebSocketCreated", org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkWebSocketCreatedEventData(reader);
    }
  };
}
