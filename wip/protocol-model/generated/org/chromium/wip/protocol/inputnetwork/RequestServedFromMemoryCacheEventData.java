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
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  /**
   Frame identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId();

  /**
   Loader identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.LoaderIdTypedef*/ loaderId();

  /**
   URL of the document this request is loaded for.
   */
  String documentURL();

  /**
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

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
    @Override public org.chromium.wip.protocol.inputnetwork.RequestServedFromMemoryCacheEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseNetworkRequestServedFromMemoryCacheEventData(reader);
    }
  };
}
