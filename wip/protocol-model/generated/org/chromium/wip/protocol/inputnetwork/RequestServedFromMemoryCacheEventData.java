// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when HTTP request has been served from memory cache.
 */
@org.chromium.protocolParser.JsonType
public interface RequestServedFromMemoryCacheEventData {
  /**
   Request identifier.
   */
  String requestId();

  /**
   Frame identifier.
   */
  String frameId();

  /**
   Loader identifier.
   */
  String loaderId();

  /**
   URL of the document this request is loaded for.
   */
  String documentURL();

  /**
   Timestamp.
   */
  Number timestamp();

  /**
   Request initiator.
   */
  org.chromium.wip.protocol.inputnetwork.InitiatorValue initiator();

  /**
   Cached resource data.
   */
  org.chromium.wip.protocol.inputnetwork.CachedResourceValue resource();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.RequestServedFromMemoryCacheEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.RequestServedFromMemoryCacheEventData>("NetworkrequestServedFromMemoryCache", org.chromium.wip.protocol.inputnetwork.RequestServedFromMemoryCacheEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.RequestServedFromMemoryCacheEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkRequestServedFromMemoryCacheEventData(reader);
    }
  };
}
