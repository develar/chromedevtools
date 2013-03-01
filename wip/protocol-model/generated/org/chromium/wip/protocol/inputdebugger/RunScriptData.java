// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Runs script with given id in a given context.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RunScriptData {
  /**
   Run result.
   */
  org.chromium.wip.protocol.inputruntime.RemoteObjectValue result();

  /**
   True if the result was thrown during the script run.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean wasThrown();

}
