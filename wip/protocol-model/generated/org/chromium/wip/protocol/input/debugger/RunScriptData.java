// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.debugger;

/**
 * Runs script with given id in a given context.
 */
@org.chromium.protocolParser.JsonType
public interface RunScriptData {
  /**
   * Run result.
   */
  org.chromium.wip.protocol.input.runtime.RemoteObjectValue result();
  /**
   * True if the result was thrown during the script run.
   */
  @org.chromium.protocolParser.JsonOptionalField
  boolean wasThrown();

}