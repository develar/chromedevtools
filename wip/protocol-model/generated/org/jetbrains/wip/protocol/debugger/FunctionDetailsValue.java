// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Information about the function.
 */
@org.chromium.protocolReader.JsonType
public interface FunctionDetailsValue {
  /**
   * Location of the function.
   */
  org.jetbrains.wip.protocol.debugger.LocationValue location();
  /**
   * Name of the function. Not present for anonymous functions.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String name();
  /**
   * Display name of the function(specified in 'displayName' property on the function object).
   */
  @org.chromium.protocolReader.JsonOptionalField
  String displayName();
  /**
   * Name of the function inferred from its initial assignment.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String inferredName();
  /**
   * Scope chain for this closure.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<org.jetbrains.wip.protocol.debugger.ScopeValue> scopeChain();

}