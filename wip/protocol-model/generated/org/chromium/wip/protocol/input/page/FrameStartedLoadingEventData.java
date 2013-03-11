// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Fired when frame has started loading.
 */
@org.chromium.protocolReader.JsonType
public interface FrameStartedLoadingEventData {
  /**
   * Id of the frame that has started loading.
   */
  String frameId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData>("PageframeStartedLoading", org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parsePageFrameStartedLoadingEventData(reader);
    }
  };
}