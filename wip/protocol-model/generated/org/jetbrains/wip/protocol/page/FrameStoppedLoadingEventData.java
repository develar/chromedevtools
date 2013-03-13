// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Fired when frame has stopped loading.
 */
@org.chromium.protocolReader.JsonType
public interface FrameStoppedLoadingEventData {
  /**
   * Id of the frame that has stopped loading.
   */
  String frameId();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.FrameStoppedLoadingEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.FrameStoppedLoadingEventData>("PageframeStoppedLoading", org.jetbrains.wip.protocol.page.FrameStoppedLoadingEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.page.FrameStoppedLoadingEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageFrameStoppedLoadingEventData(reader);
    }
  };
}