// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Fired if request ended up loading from cache.
 */
@org.chromium.protocolReader.JsonType
public interface RequestServedFromCacheEventData {
  /**
   * Request identifier.
   */
  String requestId();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.RequestServedFromCacheEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.RequestServedFromCacheEventData>("NetworkrequestServedFromCache", org.jetbrains.wip.protocol.network.RequestServedFromCacheEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.network.RequestServedFromCacheEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkRequestServedFromCacheEventData(reader);
    }
  };
}