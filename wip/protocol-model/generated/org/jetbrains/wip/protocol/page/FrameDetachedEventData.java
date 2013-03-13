// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Fired when frame has been detached from its parent.
 */
@org.chromium.protocolReader.JsonType
public interface FrameDetachedEventData {
  /**
   * Id of the frame that has been detached.
   */
  String frameId();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.FrameDetachedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.FrameDetachedEventData>("PageframeDetached", org.jetbrains.wip.protocol.page.FrameDetachedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.page.FrameDetachedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageFrameDetachedEventData(reader);
    }
  };
}