// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when HTTP response is available.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ResponseReceivedEventData {
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
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

  /**
   Resource type.
   */
  org.chromium.wip.protocol.inputpage.ResourceTypeEnum type();

  /**
   Response data.
   */
  org.chromium.wip.protocol.inputnetwork.ResponseValue response();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.ResponseReceivedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.ResponseReceivedEventData>("NetworkresponseReceived", org.chromium.wip.protocol.inputnetwork.ResponseReceivedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.ResponseReceivedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkResponseReceivedEventData(obj);
    }
  };
}
