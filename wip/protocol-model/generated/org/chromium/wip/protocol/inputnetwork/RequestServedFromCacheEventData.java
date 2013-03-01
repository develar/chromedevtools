// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired if request ended up loading from cache.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RequestServedFromCacheEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData>("NetworkrequestServedFromCache", org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkRequestServedFromCacheEventData(obj);
    }
  };
}
