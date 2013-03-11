// Generated source
package org.chromium.wip.protocol.input.network;

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
  org.chromium.wip.protocol.input.network.RequestValue request();
  /**
   * Timestamp.
   */
  double timestamp();
  /**
   * Request initiator.
   */
  org.chromium.wip.protocol.input.network.InitiatorValue initiator();
  /**
   * Redirect response data.
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.chromium.wip.protocol.input.network.ResponseValue redirectResponse();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.RequestWillBeSentEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.RequestWillBeSentEventData>("NetworkrequestWillBeSent", org.chromium.wip.protocol.input.network.RequestWillBeSentEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.RequestWillBeSentEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return parser.parseNetworkRequestWillBeSentEventData(reader);
    }
  };
}