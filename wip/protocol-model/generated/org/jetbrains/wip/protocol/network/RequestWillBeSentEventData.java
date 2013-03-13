// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Fired when page is about to send HTTP request.
 */
@org.chromium.protocolReader.JsonType
public interface RequestWillBeSentEventData {
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
   * URL of the document this request is loaded for.
   */
  String documentURL();
  /**
   * Request data.
   */
  org.jetbrains.wip.protocol.network.RequestValue request();
  /**
   * Timestamp.
   */
  double timestamp();
  /**
   * Request initiator.
   */
  org.jetbrains.wip.protocol.network.InitiatorValue initiator();
  /**
   * Redirect response data.
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.jetbrains.wip.protocol.network.ResponseValue redirectResponse();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.RequestWillBeSentEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.RequestWillBeSentEventData>("NetworkrequestWillBeSent", org.jetbrains.wip.protocol.network.RequestWillBeSentEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.network.RequestWillBeSentEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkRequestWillBeSentEventData(reader);
    }
  };
}