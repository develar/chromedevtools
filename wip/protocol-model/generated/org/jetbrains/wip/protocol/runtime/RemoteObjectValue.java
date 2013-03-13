// Generated source
package org.jetbrains.wip.protocol.runtime;

/**
 * Mirror object referencing original JavaScript object.
 */
@org.chromium.protocolReader.JsonType
public interface RemoteObjectValue {
  /**
   * Object type.
   */
  Type type();
  /**
   * Object subtype hint. Specified for <code>object</code> type values only.
   */
  @org.chromium.protocolReader.JsonOptionalField
  Subtype subtype();
  /**
   * Object class (constructor) name. Specified for <code>object</code> type values only.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String className();
  /**
   * Remote object value (in case of primitive values or JSON values if it was requested).
   */
  @org.chromium.protocolReader.JsonOptionalField
  @org.chromium.protocolReader.JsonNullable
  com.google.gson.stream.JsonReaderEx value();
  /**
   * String representation of the object.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String description();
  /**
   * Unique object identifier (for non-primitive values).
   */
  @org.chromium.protocolReader.JsonOptionalField
  String objectId();
  /**
   * Preview containsing abbreviated property values.
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.jetbrains.wip.protocol.runtime.ObjectPreviewValue preview();

  /**
   * Object type.
   */
  public enum Type {
    OBJECT, FUNCTION, UNDEFINED, STRING, NUMBER, BOOLEAN
  }
  /**
   * Object subtype hint. Specified for <code>object</code> type values only.
   */
  public enum Subtype {
    ARRAY, NULL, NODE, REGEXP, DATE
  }
}