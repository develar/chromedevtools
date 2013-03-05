// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.runtime;

/**
 Evaluates expression on global object.
 */
@org.chromium.protocolParser.JsonType
public interface EvaluateData {
  /**
   Evaluation result.
   */
  org.chromium.wip.protocol.input.runtime.RemoteObjectValue result();

  /**
   True if the result was thrown during the evaluation.
   */
  @org.chromium.protocolParser.JsonOptionalField
  boolean wasThrown();

}
