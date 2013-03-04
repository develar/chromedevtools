// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputruntime;

/**
 Mirror object referencing original JavaScript object.
 */
@org.chromium.protocolParser.JsonType
public interface RemoteObjectValue {
  /**
   Object type.
   */
  Type type();

  /**
   Object subtype hint. Specified for <code>object</code> type values only.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Subtype subtype();

  /**
   Object class (constructor) name. Specified for <code>object</code> type values only.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String className();

  /**
   Remote object value (in case of primitive values or JSON values if it was requested).
   */
  @org.chromium.protocolParser.JsonOptionalField
  @org.chromium.protocolParser.JsonNullable
  Object value();

  /**
   String representation of the object.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String description();

  /**
   Unique object identifier (for non-primitive values).
   */
  @org.chromium.protocolParser.JsonOptionalField
  String objectId();

  /**
   Preview containsing abbreviated property values.
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.inputruntime.ObjectPreviewValue preview();

  /**
   Object type.
   */
  public enum Type {
    OBJECT,
    FUNCTION,
    UNDEFINED,
    STRING,
    NUMBER,
    BOOLEAN,
  }
  /**
   Object subtype hint. Specified for <code>object</code> type values only.
   */
  public enum Subtype {
    ARRAY,
    NULL,
    NODE,
    REGEXP,
    DATE,
  }
}
