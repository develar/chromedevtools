// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired once navigation of the frame has completed. Frame is now associated with the new loader.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface FrameNavigatedEventData {
  /**
   Frame object.
   */
  org.chromium.wip.protocol.inputpage.FrameValue frame();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.FrameNavigatedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.FrameNavigatedEventData>("PageframeNavigated", org.chromium.wip.protocol.inputpage.FrameNavigatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.FrameNavigatedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageFrameNavigatedEventData(obj);
    }
  };
}
