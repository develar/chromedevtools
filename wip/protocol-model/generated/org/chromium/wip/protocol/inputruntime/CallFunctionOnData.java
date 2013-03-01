// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputruntime;

/**
 Calls function with given declaration on the given object. Object group of the result is inherited from the target object.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CallFunctionOnData {
  /**
   Call result.
   */
  org.chromium.wip.protocol.inputruntime.RemoteObjectValue result();

  /**
   True if the result was thrown during the evaluation.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean wasThrown();

}
