// Generated source
package org.chromium.wip.protocol.input.timeline;

/**
 * Fired for every instrumentation event while timeline is started.
 */
@org.chromium.protocolReader.JsonType
public interface EventRecordedEventData {
  /**
   * Timeline event record data.
   */
  org.chromium.wip.protocol.input.timeline.TimelineEventValue record();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.timeline.EventRecordedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.timeline.EventRecordedEventData>("TimelineeventRecorded", org.chromium.wip.protocol.input.timeline.EventRecordedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.timeline.EventRecordedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readTimelineEventRecordedEventData(reader);
    }
  };
}