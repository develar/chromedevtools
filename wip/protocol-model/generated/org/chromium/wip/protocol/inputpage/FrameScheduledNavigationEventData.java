// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when frame schedules a potential navigation.
 */
@org.chromium.protocolParser.JsonType
public interface FrameScheduledNavigationEventData {
  /**
   Id of the frame that has scheduled a navigation.
   */
  String frameId();

  /**
   Delay (in seconds) until the navigation is scheduled to begin. The navigation is not guaranteed to start.
   */
  Number delay();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData>("PageframeScheduledNavigation", org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parsePageFrameScheduledNavigationEventData(reader);
    }
  };
}
