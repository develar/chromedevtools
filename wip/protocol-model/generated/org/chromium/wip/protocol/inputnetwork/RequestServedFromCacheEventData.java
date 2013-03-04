// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired if request ended up loading from cache.
 */
@org.chromium.protocolParser.JsonType
public interface RequestServedFromCacheEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData>("NetworkrequestServedFromCache", org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseNetworkRequestServedFromCacheEventData(reader);
    }
  };
}
