// Generated source
package org.jetbrains.wip.protocol.runtime;

/**
 * Returns properties of a given object. Object group of the result is inherited from the target object.
 */
@org.chromium.protocolReader.JsonType
public interface GetPropertiesResult {
  /**
   * Object properties.
   */
  java.util.List<org.jetbrains.wip.protocol.runtime.PropertyDescriptorValue> result();
  /**
   * Internal object properties.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<org.jetbrains.wip.protocol.runtime.InternalPropertyDescriptorValue> internalProperties();

}