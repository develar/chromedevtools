// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputruntime;

/**
 Mirror object referencing original JavaScript object.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RemoteObjectValue {
  /**
   Object type.
   */
  Type type();

  /**
   Object subtype hint. Specified for <code>object</code> type values only.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Subtype subtype();

  /**
   Object class (constructor) name. Specified for <code>object</code> type values only.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String className();

  /**
   Remote object value (in case of primitive values or JSON values if it was requested).
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  @org.chromium.sdk.internal.protocolparser.JsonNullable
  Object value();

  /**
   String representation of the object.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String description();

  /**
   Unique object identifier (for non-primitive values).
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String/*See org.chromium.wip.protocol.commonruntime.RemoteObjectIdTypedef*/ objectId();

  /**
   Preview containsing abbreviated property values.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
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
