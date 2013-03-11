// Generated source
package org.chromium.wip.protocol.input.network;

/**
 * Fired when HTTP request has failed to load.
 */
@org.chromium.protocolReader.JsonType
public interface LoadingFailedEventData {
  /**
   * Request identifier.
   */
  String requestId();
  /**
   * Timestamp.
   */
  double timestamp();
  /**
   * User friendly error message.
   */
  String errorText();
  /**
   * True if loading was canceled.
   */
  @org.chromium.protocolReader.JsonOptionalField
  boolean canceled();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.LoadingFailedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.LoadingFailedEventData>("NetworkloadingFailed", org.chromium.wip.protocol.input.network.LoadingFailedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.LoadingFailedEventData parse(org.chromium.wip.protocol.input.ProtocolReponseReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseNetworkLoadingFailedEventData(reader);
    }
  };
}