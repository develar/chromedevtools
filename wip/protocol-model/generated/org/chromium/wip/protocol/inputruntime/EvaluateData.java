// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputruntime;

/**
 Evaluates expression on global object.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface EvaluateData {
  /**
   Evaluation result.
   */
  org.chromium.wip.protocol.inputruntime.RemoteObjectValue result();

  /**
   True if the result was thrown during the evaluation.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Boolean wasThrown();

}
