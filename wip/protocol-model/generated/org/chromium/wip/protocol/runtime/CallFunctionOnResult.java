// Generated source
package org.chromium.wip.protocol.runtime;

/**
 * Calls function with given declaration on the given object. Object group of the result is inherited from the target object.
 */
@org.chromium.protocolReader.JsonType
public interface CallFunctionOnResult {
  /**
   * Call result.
   */
  org.chromium.wip.protocol.runtime.RemoteObjectValue result();
  /**
   * True if the result was thrown during the evaluation.
   */
  @org.chromium.protocolReader.JsonOptionalField
  boolean wasThrown();

}