// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Runs script with given id in a given context.
 */
@org.chromium.protocolReader.JsonType
public interface RunScriptResult {
  /**
   * Run result.
   */
  org.jetbrains.wip.protocol.runtime.RemoteObjectValue result();
  /**
   * True if the result was thrown during the script run.
   */
  @org.chromium.protocolReader.JsonOptionalField
  boolean wasThrown();

}