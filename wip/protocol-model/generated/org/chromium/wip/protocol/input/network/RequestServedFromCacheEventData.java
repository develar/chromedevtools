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

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData>("NetworkrequestServedFromCache", org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData parse(org.chromium.wip.protocol.input.ProtocolReponseReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseNetworkRequestServedFromCacheEventData(reader);
    }
  };
}