// Generated source
package org.chromium.wip.protocol.input.network;

/**
 * Fired when HTTP request has been served from memory cache.
 */
@org.chromium.protocolReader.JsonType
public interface RequestServedFromMemoryCacheEventData {
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
   * Timestamp.
   */
  double timestamp();
  /**
   * Request initiator.
   */
  org.chromium.wip.protocol.input.network.InitiatorValue initiator();
  /**
   * Cached resource data.
   */
  org.chromium.wip.protocol.input.network.CachedResourceValue resource();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.RequestServedFromMemoryCacheEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.RequestServedFromMemoryCacheEventData>("NetworkrequestServedFromMemoryCache", org.chromium.wip.protocol.input.network.RequestServedFromMemoryCacheEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.RequestServedFromMemoryCacheEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkRequestServedFromMemoryCacheEventData(reader);
    }
  };
}