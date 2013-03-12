// Generated source
package org.chromium.wip.protocol.page;

/**
 * Fired when frame has stopped loading.
 */
@org.chromium.protocolReader.JsonType
public interface FrameStoppedLoadingEventData {
  /**
   * Id of the frame that has stopped loading.
   */
  String frameId();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.page.FrameStoppedLoadingEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.page.FrameStoppedLoadingEventData>("PageframeStoppedLoading", org.chromium.wip.protocol.page.FrameStoppedLoadingEventData.class) {
    @Override
    public org.chromium.wip.protocol.page.FrameStoppedLoadingEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageFrameStoppedLoadingEventData(reader);
    }
  };
}