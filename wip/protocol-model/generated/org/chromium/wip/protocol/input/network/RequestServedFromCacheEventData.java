// Generated source
package org.chromium.wip.protocol.input.network;

/**
 * Fired if request ended up loading from cache.
 */
@org.chromium.protocolReader.JsonType
public interface RequestServedFromCacheEventData {
  /**
   * Request identifier.
   */
  String requestId();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData>("NetworkrequestServedFromCache", org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkRequestServedFromCacheEventData(reader);
    }
  };
}