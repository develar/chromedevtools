// Generated source
package org.chromium.wip.protocol.network;

/**
 * Fired if request ended up loading from cache.
 */
@org.chromium.protocolReader.JsonType
public interface RequestServedFromCacheEventData {
  /**
   * Request identifier.
   */
  String requestId();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.RequestServedFromCacheEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.network.RequestServedFromCacheEventData>("NetworkrequestServedFromCache", org.chromium.wip.protocol.network.RequestServedFromCacheEventData.class) {
    @Override
    public org.chromium.wip.protocol.network.RequestServedFromCacheEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkRequestServedFromCacheEventData(reader);
    }
  };
}