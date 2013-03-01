// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when page is about to send HTTP request.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RequestWillBeSentEventData {
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
   Request data.
   */
  org.chromium.wip.protocol.inputnetwork.RequestValue request();

  /**
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

  /**
   Request initiator.
   */
  org.chromium.wip.protocol.inputnetwork.InitiatorValue initiator();

  /**
   Redirect response data.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.wip.protocol.inputnetwork.ResponseValue redirectResponse();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.RequestWillBeSentEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.RequestWillBeSentEventData>("NetworkrequestWillBeSent", org.chromium.wip.protocol.inputnetwork.RequestWillBeSentEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.RequestWillBeSentEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkRequestWillBeSentEventData(obj);
    }
  };
}
