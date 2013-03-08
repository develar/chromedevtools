// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Fired when frame has stopped loading.
 */
@org.chromium.protocolReader.JsonType
public interface FrameStoppedLoadingEventData {
  /**
   * Id of the frame that has stopped loading.
   */
  String frameId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameStoppedLoadingEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameStoppedLoadingEventData>("PageframeStoppedLoading", org.chromium.wip.protocol.input.page.FrameStoppedLoadingEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.FrameStoppedLoadingEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parsePageFrameStoppedLoadingEventData(reader);
    }
  };
}