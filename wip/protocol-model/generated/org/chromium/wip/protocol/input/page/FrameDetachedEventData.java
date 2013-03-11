// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Fired when frame has been detached from its parent.
 */
@org.chromium.protocolReader.JsonType
public interface FrameDetachedEventData {
  /**
   * Id of the frame that has been detached.
   */
  String frameId();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameDetachedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameDetachedEventData>("PageframeDetached", org.chromium.wip.protocol.input.page.FrameDetachedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.FrameDetachedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageFrameDetachedEventData(reader);
    }
  };
}