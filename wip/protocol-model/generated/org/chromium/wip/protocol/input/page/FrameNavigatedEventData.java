// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
 */
@org.chromium.protocolReader.JsonType
public interface FrameNavigatedEventData {
  /**
   * Frame object.
   */
  org.chromium.wip.protocol.input.page.FrameValue frame();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameNavigatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameNavigatedEventData>("PageframeNavigated", org.chromium.wip.protocol.input.page.FrameNavigatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.FrameNavigatedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parsePageFrameNavigatedEventData(reader);
    }
  };
}