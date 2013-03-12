// Generated source
package org.chromium.wip.protocol.network;

/**
 * Fired when HTTP request has finished loading.
 */
@org.chromium.protocolReader.JsonType
public interface LoadingFinishedEventData {
  /**
   * Request identifier.
   */
  String requestId();
  /**
   * Timestamp.
   */
  double timestamp();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.LoadingFinishedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.LoadingFinishedEventData>("NetworkloadingFinished", org.chromium.wip.protocol.network.LoadingFinishedEventData.class) {
    @Override
    public org.chromium.wip.protocol.network.LoadingFinishedEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkLoadingFinishedEventData(reader);
    }
  };
}