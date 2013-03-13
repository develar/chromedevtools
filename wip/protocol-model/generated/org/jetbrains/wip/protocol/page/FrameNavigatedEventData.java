// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
 */
@org.chromium.protocolReader.JsonType
public interface FrameNavigatedEventData {
  /**
   * Frame object.
   */
  org.jetbrains.wip.protocol.page.FrameValue frame();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.FrameNavigatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.FrameNavigatedEventData>("PageframeNavigated", org.jetbrains.wip.protocol.page.FrameNavigatedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.page.FrameNavigatedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageFrameNavigatedEventData(reader);
    }
  };
}