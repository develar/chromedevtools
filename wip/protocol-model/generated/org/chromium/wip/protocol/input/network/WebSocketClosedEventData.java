// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.network;

/**
 Fired when WebSocket is closed.
 */
@org.chromium.protocolParser.JsonType
public interface WebSocketClosedEventData {
  /**
   Request identifier.
   */
  String requestId();

  /**
   Timestamp.
   */
  Number timestamp();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketClosedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketClosedEventData>("NetworkwebSocketClosed", org.chromium.wip.protocol.input.network.WebSocketClosedEventData.class) {
    @Override public org.chromium.wip.protocol.input.network.WebSocketClosedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkWebSocketClosedEventData(reader);
    }
  };
}
