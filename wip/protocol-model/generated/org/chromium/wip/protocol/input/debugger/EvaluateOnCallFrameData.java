// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.debugger;

/**
 Evaluates expression on a given call frame.
 */
@org.chromium.protocolParser.JsonType
public interface EvaluateOnCallFrameData {
  /**
   Object wrapper for the evaluation result.
   */
  org.chromium.wip.protocol.input.runtime.RemoteObjectValue result();

  /**
   True if the result was thrown during the evaluation.
   */
  @org.chromium.protocolParser.JsonOptionalField
  boolean wasThrown();

}
