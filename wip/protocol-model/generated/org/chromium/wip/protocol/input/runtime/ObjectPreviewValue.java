// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.runtime;

/**
 * Object containing abbreviated remote object value.
 */
@org.chromium.protocolParser.JsonType
public interface ObjectPreviewValue {
  /**
   * Determines whether preview is lossless (contains all information of the original object).
   */
  boolean lossless();
  /**
   * True iff some of the properties of the original did not fit.
   */
  boolean overflow();
  /**
   * List of the properties.
   */
  java.util.List<org.chromium.wip.protocol.input.runtime.PropertyPreviewValue> properties();

}