// Generated source
package org.jetbrains.wip.protocol.runtime;

/**
 * Object containing abbreviated remote object value.
 */
@org.chromium.protocolReader.JsonType
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
  java.util.List<org.jetbrains.wip.protocol.runtime.PropertyPreviewValue> properties();

}