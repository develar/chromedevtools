// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.page;

/**
 Fired when frame has started loading.
 */
@org.chromium.protocolParser.JsonType
public interface FrameStartedLoadingEventData {
  /**
   Id of the frame that has started loading.
   */
  String frameId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData>("PageframeStartedLoading", org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData.class) {
    @Override public org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parsePageFrameStartedLoadingEventData(reader);
    }
  };
}
