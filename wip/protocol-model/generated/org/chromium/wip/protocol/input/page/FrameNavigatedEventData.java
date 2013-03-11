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

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameNavigatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameNavigatedEventData>("PageframeNavigated", org.chromium.wip.protocol.input.page.FrameNavigatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.FrameNavigatedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageFrameNavigatedEventData(reader);
    }
  };
}