// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when frame has stopped loading.
 */
@org.chromium.protocolParser.JsonType
public interface FrameStoppedLoadingEventData {
  /**
   Id of the frame that has stopped loading.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameStoppedLoadingEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameStoppedLoadingEventData>("PageframeStoppedLoading", org.chromium.wip.protocol.inputpage.FrameStoppedLoadingEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.FrameStoppedLoadingEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parsePageFrameStoppedLoadingEventData(reader);
    }
  };
}
