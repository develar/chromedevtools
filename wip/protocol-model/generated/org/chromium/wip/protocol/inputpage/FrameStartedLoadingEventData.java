// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when frame has started loading.
 */
@org.chromium.protocolParser.JsonType
public interface FrameStartedLoadingEventData {
  /**
   Id of the frame that has started loading.
   */
  String frameId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData>("PageframeStartedLoading", org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parsePageFrameStartedLoadingEventData(reader);
    }
  };
}
