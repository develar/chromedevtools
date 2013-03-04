// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Evaluates expression on a given call frame.
 */
@org.chromium.protocolParser.JsonType
public interface EvaluateOnCallFrameData {
  /**
   Object wrapper for the evaluation result.
   */
  org.chromium.wip.protocol.inputruntime.RemoteObjectValue result();

  /**
   True if the result was thrown during the evaluation.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Boolean wasThrown();

}
