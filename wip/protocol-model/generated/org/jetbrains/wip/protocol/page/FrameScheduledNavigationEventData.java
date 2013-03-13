// Generated source
package org.jetbrains.wip.protocol.page;

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

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.FrameScheduledNavigationEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.FrameScheduledNavigationEventData>("PageframeScheduledNavigation", org.jetbrains.wip.protocol.page.FrameScheduledNavigationEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.page.FrameScheduledNavigationEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageFrameScheduledNavigationEventData(reader);
    }
  };
}