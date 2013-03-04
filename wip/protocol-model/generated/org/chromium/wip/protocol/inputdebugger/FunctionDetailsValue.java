// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Information about the function.
 */
@org.chromium.protocolParser.JsonType
public interface FunctionDetailsValue {
  /**
   Location of the function.
   */
  org.chromium.wip.protocol.inputdebugger.LocationValue location();

  /**
   Name of the function. Not present for anonymous functions.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String name();

  /**
   Display name of the function(specified in 'displayName' property on the function object).
   */
  @org.chromium.protocolParser.JsonOptionalField
  String displayName();

  /**
   Name of the function inferred from its initial assignment.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String inferredName();

  /**
   Scope chain for this closure.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.inputdebugger.ScopeValue> scopeChain();

}
