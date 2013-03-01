// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when frame has started loading.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface FrameStartedLoadingEventData {
  /**
   Id of the frame that has started loading.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData>("PageframeStartedLoading", org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageFrameStartedLoadingEventData(obj);
    }
  };
}
