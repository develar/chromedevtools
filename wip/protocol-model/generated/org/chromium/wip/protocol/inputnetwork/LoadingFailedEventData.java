// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Fired when HTTP request has failed to load.
 */
@org.chromium.protocolParser.JsonType
public interface LoadingFailedEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

  /**
   User friendly error message.
   */
  String errorText();

  /**
   True if loading was canceled.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Boolean canceled();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.LoadingFailedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.LoadingFailedEventData>("NetworkloadingFailed", org.chromium.wip.protocol.inputnetwork.LoadingFailedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.LoadingFailedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseNetworkLoadingFailedEventData(reader);
    }
  };
}
