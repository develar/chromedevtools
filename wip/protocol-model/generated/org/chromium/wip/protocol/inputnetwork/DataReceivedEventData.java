// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when data chunk was received over the network.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface DataReceivedEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

  /**
   Data chunk length.
   */
  long dataLength();

  /**
   Actual bytes received (might be less than dataLength for compressed encodings).
   */
  long encodedDataLength();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.DataReceivedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputnetwork.DataReceivedEventData>("NetworkdataReceived", org.chromium.wip.protocol.inputnetwork.DataReceivedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.DataReceivedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseNetworkDataReceivedEventData(obj);
    }
  };
}
