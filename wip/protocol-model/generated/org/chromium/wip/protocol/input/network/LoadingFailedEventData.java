// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.network;

/**
 Fired when HTTP request has failed to load.
 */
@org.chromium.protocolParser.JsonType
public interface LoadingFailedEventData {
  /**
   Request identifier.
   */
  String requestId();

  /**
   Timestamp.
   */
  Number timestamp();

  /**
   User friendly error message.
   */
  String errorText();

  /**
   True if loading was canceled.
   */
  @org.chromium.protocolParser.JsonOptionalField
  boolean canceled();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.LoadingFailedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.LoadingFailedEventData>("NetworkloadingFailed", org.chromium.wip.protocol.input.network.LoadingFailedEventData.class) {
    @Override public org.chromium.wip.protocol.input.network.LoadingFailedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkLoadingFailedEventData(reader);
    }
  };
}
