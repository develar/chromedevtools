// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.page;

/**
 Fired when frame has been detached from its parent.
 */
@org.chromium.protocolParser.JsonType
public interface FrameDetachedEventData {
  /**
   Id of the frame that has been detached.
   */
  String frameId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameDetachedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameDetachedEventData>("PageframeDetached", org.chromium.wip.protocol.input.page.FrameDetachedEventData.class) {
    @Override public org.chromium.wip.protocol.input.page.FrameDetachedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parsePageFrameDetachedEventData(reader);
    }
  };
}
