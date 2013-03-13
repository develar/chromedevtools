// Generated source
package org.jetbrains.wip.protocol.timeline;

/**
 * Fired for every instrumentation event while timeline is started.
 */
@org.chromium.protocolReader.JsonType
public interface EventRecordedEventData {
  /**
   * Timeline event record data.
   */
  org.jetbrains.wip.protocol.timeline.TimelineEventValue record();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.timeline.EventRecordedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.timeline.EventRecordedEventData>("TimelineeventRecorded", org.jetbrains.wip.protocol.timeline.EventRecordedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.timeline.EventRecordedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readTimelineEventRecordedEventData(reader);
    }
  };
}