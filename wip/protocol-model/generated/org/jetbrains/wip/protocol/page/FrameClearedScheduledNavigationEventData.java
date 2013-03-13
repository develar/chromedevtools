// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Fired when frame no longer has a scheduled navigation.
 */
@org.chromium.protocolReader.JsonType
public interface FrameClearedScheduledNavigationEventData {
  /**
   * Id of the frame that has cleared its scheduled navigation.
   */
  String frameId();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.FrameClearedScheduledNavigationEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.FrameClearedScheduledNavigationEventData>("PageframeClearedScheduledNavigation", org.jetbrains.wip.protocol.page.FrameClearedScheduledNavigationEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.page.FrameClearedScheduledNavigationEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageFrameClearedScheduledNavigationEventData(reader);
    }
  };
}