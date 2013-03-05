// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.runtime;

/**
 Returns properties of a given object. Object group of the result is inherited from the target object.
 */
@org.chromium.protocolParser.JsonType
public interface GetPropertiesData {
  /**
   Object properties.
   */
  java.util.List<org.chromium.wip.protocol.input.runtime.PropertyDescriptorValue> result();

  /**
   Internal object properties.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.input.runtime.InternalPropertyDescriptorValue> internalProperties();

}
