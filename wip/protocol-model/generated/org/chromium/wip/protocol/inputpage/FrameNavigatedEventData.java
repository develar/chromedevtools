// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired once navigation of the frame has completed. Frame is now associated with the new loader.
 */
@org.chromium.protocolParser.JsonType
public interface FrameNavigatedEventData {
  /**
   Frame object.
   */
  org.chromium.wip.protocol.inputpage.FrameValue frame();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameNavigatedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.FrameNavigatedEventData>("PageframeNavigated", org.chromium.wip.protocol.inputpage.FrameNavigatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.FrameNavigatedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parsePageFrameNavigatedEventData(reader);
    }
  };
}
