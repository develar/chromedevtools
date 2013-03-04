// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when frame has been detached from its parent.
 */
@org.chromium.protocolParser.JsonType
public interface FrameDetachedEventData {
  /**
   Id of the frame that has been detached.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameDetachedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameDetachedEventData>("PageframeDetached", org.chromium.wip.protocol.inputpage.FrameDetachedEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.FrameDetachedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parsePageFrameDetachedEventData(reader);
    }
  };
}
