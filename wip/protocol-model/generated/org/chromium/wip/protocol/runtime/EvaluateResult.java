// Generated source
package org.chromium.wip.protocol.runtime;

/**
 * Evaluates expression on global object.
 */
@org.chromium.protocolReader.JsonType
public interface EvaluateResult {
  /**
   * Evaluation result.
   */
  org.chromium.wip.protocol.runtime.RemoteObjectValue result();
  /**
   * True if the result was thrown during the evaluation.
   */
  @org.chromium.protocolReader.JsonOptionalField
  boolean wasThrown();

}