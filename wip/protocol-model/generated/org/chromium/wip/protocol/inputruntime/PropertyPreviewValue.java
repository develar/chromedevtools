// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputruntime;

@org.chromium.protocolParser.JsonType
public interface PropertyPreviewValue {
  /**
   Property name.
   */
  String name();

  /**
   Object type.
   */
  Type type();

  /**
   User-friendly property value string.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String value();

  /**
   Nested value preview.
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.inputruntime.ObjectPreviewValue valuePreview();

  /**
   Object subtype hint. Specified for <code>object</code> type values only.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Subtype subtype();

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
