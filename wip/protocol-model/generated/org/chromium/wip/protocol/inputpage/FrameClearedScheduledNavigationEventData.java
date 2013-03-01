// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when frame no longer has a scheduled navigation.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface FrameClearedScheduledNavigationEventData {
  /**
   Id of the frame that has cleared its scheduled navigation.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData>("PageframeClearedScheduledNavigation", org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageFrameClearedScheduledNavigationEventData(obj);
    }
  };
}
