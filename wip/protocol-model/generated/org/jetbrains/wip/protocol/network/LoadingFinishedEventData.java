// Generated source
package org.jetbrains.wip.protocol.network;

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

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.LoadingFinishedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.LoadingFinishedEventData>("NetworkloadingFinished", org.jetbrains.wip.protocol.network.LoadingFinishedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.network.LoadingFinishedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkLoadingFinishedEventData(reader);
    }
  };
}