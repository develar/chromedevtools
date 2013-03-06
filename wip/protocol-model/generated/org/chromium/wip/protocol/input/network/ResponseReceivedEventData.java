// Generated source
package org.chromium.wip.protocol.input.network;

/**
 * Fired when HTTP response is available.
 */
@org.chromium.protocolParser.JsonType
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
  org.chromium.wip.protocol.input.page.ResourceTypeEnum type();
  /**
   * Response data.
   */
  org.chromium.wip.protocol.input.network.ResponseValue response();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.ResponseReceivedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.ResponseReceivedEventData>("NetworkresponseReceived", org.chromium.wip.protocol.input.network.ResponseReceivedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.ResponseReceivedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkResponseReceivedEventData(reader);
    }
  };
}