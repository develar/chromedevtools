// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputruntime;

/**
 Evaluates expression on global object.
 */
@org.chromium.protocolParser.JsonType
public interface EvaluateData {
  /**
   Evaluation result.
   */
  org.chromium.wip.protocol.inputruntime.RemoteObjectValue result();

  /**
   True if the result was thrown during the evaluation.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Boolean wasThrown();

}
