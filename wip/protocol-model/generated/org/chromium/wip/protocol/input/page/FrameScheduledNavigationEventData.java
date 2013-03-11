// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Fired when frame schedules a potential navigation.
 */
@org.chromium.protocolReader.JsonType
public interface FrameScheduledNavigationEventData {
  /**
   * Id of the frame that has scheduled a navigation.
   */
  String frameId();
  /**
   * Delay (in seconds) until the navigation is scheduled to begin. The navigation is not guaranteed to start.
   */
  double delay();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameScheduledNavigationEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.FrameScheduledNavigationEventData>("PageframeScheduledNavigation", org.chromium.wip.protocol.input.page.FrameScheduledNavigationEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.FrameScheduledNavigationEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageFrameScheduledNavigationEventData(reader);
    }
  };
}