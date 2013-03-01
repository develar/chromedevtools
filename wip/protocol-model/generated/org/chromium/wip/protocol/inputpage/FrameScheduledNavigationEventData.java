// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when frame schedules a potential navigation.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface FrameScheduledNavigationEventData {
  /**
   Id of the frame that has scheduled a navigation.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId();

  /**
   Delay (in seconds) until the navigation is scheduled to begin. The navigation is not guaranteed to start.
   */
  Number delay();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData>("PageframeScheduledNavigation", org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageFrameScheduledNavigationEventData(obj);
    }
  };
}