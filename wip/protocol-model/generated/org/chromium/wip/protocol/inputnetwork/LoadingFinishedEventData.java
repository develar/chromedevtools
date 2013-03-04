// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

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
  Number timestamp();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData>("NetworkloadingFinished", org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseNetworkLoadingFinishedEventData(reader);
    }
  };
}
