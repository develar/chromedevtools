// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when frame no longer has a scheduled navigation.
 */
@org.chromium.protocolParser.JsonType
public interface FrameClearedScheduledNavigationEventData {
  /**
   Id of the frame that has cleared its scheduled navigation.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData>("PageframeClearedScheduledNavigation", org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parsePageFrameClearedScheduledNavigationEventData(reader);
    }
  };
}
