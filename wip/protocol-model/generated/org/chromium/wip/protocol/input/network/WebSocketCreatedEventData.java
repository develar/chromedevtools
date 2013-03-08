// Generated source
package org.chromium.wip.protocol.input.network;

/**
 * Fired upon WebSocket creation.
 */
@org.chromium.protocolReader.JsonType
public interface WebSocketCreatedEventData {
  /**
   * Request identifier.
   */
  String requestId();
  /**
   * WebSocket request URL.
   */
  String url();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketCreatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketCreatedEventData>("NetworkwebSocketCreated", org.chromium.wip.protocol.input.network.WebSocketCreatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.WebSocketCreatedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkWebSocketCreatedEventData(reader);
    }
  };
}