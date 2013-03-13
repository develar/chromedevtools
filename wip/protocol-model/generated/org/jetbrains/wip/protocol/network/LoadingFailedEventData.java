// Generated source
package org.jetbrains.wip.protocol.network;

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

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.LoadingFailedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.LoadingFailedEventData>("NetworkloadingFailed", org.jetbrains.wip.protocol.network.LoadingFailedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.network.LoadingFailedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkLoadingFailedEventData(reader);
    }
  };
}