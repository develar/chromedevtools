// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when HTTP request has finished loading.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface LoadingFinishedEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData>("NetworkloadingFinished", org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkLoadingFinishedEventData(obj);
    }
  };
}
