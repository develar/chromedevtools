// Generated source
package org.jetbrains.wip.protocol.timeline;

/**
 * Timeline record contains information about the recorded activity.
 */
@org.chromium.protocolReader.JsonType
public interface TimelineEventValue {
  /**
   * Event type.
   */
  String type();
  /**
   * If present, identifies the thread that produced the event.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String thread();
  /**
   * Event data.
   */
  Data data();
  /**
   * Nested records.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<org.jetbrains.wip.protocol.timeline.TimelineEventValue> children();

  /**
   * Event data.
   */
  @org.chromium.protocolReader.JsonType(allowsOtherProperties=true)
  public interface Data extends org.jetbrains.jsonProtocol.JsonObjectBased {

  }
}