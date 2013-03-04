// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputruntime;

/**
 Object property descriptor.
 */
@org.chromium.protocolParser.JsonType
public interface PropertyDescriptorValue {
  /**
   Property name.
   */
  String name();

  /**
   The value associated with the property.
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.inputruntime.RemoteObjectValue value();

  /**
   True if the value associated with the property may be changed (data descriptors only).
   */
  @org.chromium.protocolParser.JsonOptionalField
  boolean writable();

  /**
   A function which serves as a getter for the property, or <code>undefined</code> if there is no getter (accessor descriptors only).
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.inputruntime.RemoteObjectValue get();

  /**
   A function which serves as a setter for the property, or <code>undefined</code> if there is no setter (accessor descriptors only).
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.inputruntime.RemoteObjectValue set();

  /**
   True if the type of this property descriptor may be changed and if the property may be deleted from the corresponding object.
   */
  boolean configurable();

  /**
   True if this property shows up during enumeration of the properties on the corresponding object.
   */
  boolean enumerable();

  /**
   True if the result was thrown during the evaluation.
   */
  @org.chromium.protocolParser.JsonOptionalField
  boolean wasThrown();

  /**
   True if the property is owned for the object.
   */
  @org.chromium.protocolParser.JsonOptionalField
  boolean isOwn();

}
