// Generated source
package org.chromium.wip.protocol.network;

/**
 * Fired when HTTP response is available.
 */
@org.chromium.protocolReader.JsonType
public interface ResponseReceivedEventData {
  /**
   * Request identifier.
   */
  String requestId();
  /**
   * Frame identifier.
   */
  String frameId();
  /**
   * Loader identifier.
   */
  String loaderId();
  /**
   * Timestamp.
   */
  double timestamp();
  /**
   * Resource type.
   */
  org.chromium.wip.protocol.page.ResourceType type();
  /**
   * Response data.
   */
  org.chromium.wip.protocol.network.ResponseValue response();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.ResponseReceivedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.ResponseReceivedEventData>("NetworkresponseReceived", org.chromium.wip.protocol.network.ResponseReceivedEventData.class) {
    @Override
    public org.chromium.wip.protocol.network.ResponseReceivedEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkResponseReceivedEventData(reader);
    }
  };
}