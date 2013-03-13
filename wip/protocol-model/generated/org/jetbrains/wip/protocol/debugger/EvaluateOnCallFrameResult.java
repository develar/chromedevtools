// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Evaluates expression on a given call frame.
 */
@org.chromium.protocolReader.JsonType
public interface EvaluateOnCallFrameResult {
  /**
   * Object wrapper for the evaluation result.
   */
  org.jetbrains.wip.protocol.runtime.RemoteObjectValue result();
  /**
   * True if the result was thrown during the evaluation.
   */
  @org.chromium.protocolReader.JsonOptionalField
  boolean wasThrown();

}