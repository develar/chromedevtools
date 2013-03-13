// Generated source
package org.jetbrains.wip.protocol.runtime;

/**
 * Object internal property descriptor. This property isn't normally visible in JavaScript code.
 */
@org.chromium.protocolReader.JsonType
public interface InternalPropertyDescriptorValue {
  /**
   * Conventional property name.
   */
  String name();
  /**
   * The value associated with the property.
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.jetbrains.wip.protocol.runtime.RemoteObjectValue value();

}