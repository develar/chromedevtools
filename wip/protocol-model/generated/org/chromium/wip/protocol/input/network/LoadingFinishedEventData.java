// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.network;

/**
 Fired when HTTP request has finished loading.
 */
@org.chromium.protocolParser.JsonType
public interface LoadingFinishedEventData {
  /**
   Request identifier.
   */
  String requestId();

  /**
   Timestamp.
   */
  double timestamp();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.LoadingFinishedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.LoadingFinishedEventData>("NetworkloadingFinished", org.chromium.wip.protocol.input.network.LoadingFinishedEventData.class) {
    @Override public org.chromium.wip.protocol.input.network.LoadingFinishedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkLoadingFinishedEventData(reader);
    }
  };
}
