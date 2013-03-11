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

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketCreatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.WebSocketCreatedEventData>("NetworkwebSocketCreated", org.chromium.wip.protocol.input.network.WebSocketCreatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.WebSocketCreatedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkWebSocketCreatedEventData(reader);
    }
  };
}