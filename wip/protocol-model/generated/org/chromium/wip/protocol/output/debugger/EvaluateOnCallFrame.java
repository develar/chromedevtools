// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Evaluates expression on a given call frame.
 */
public final class EvaluateOnCallFrame extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.EvaluateOnCallFrameData> {
  /**
   * @param callFrameId Call frame identifier to evaluate on.
   * @param expression Expression to evaluate.
   */
  public EvaluateOnCallFrame(String callFrameId, String expression) {
    put("callFrameId", callFrameId);
    put("expression", expression);
  }

  /**
   * @param v String object group name to put result into (allows rapid releasing resulting object handles using <code>releaseObjectGroup</code>).
   */
  public EvaluateOnCallFrame objectGroup(String v) {
    if (v != null) {
      put("objectGroup", v);
    }
    return this;
  }

  /**
   * @param v Specifies whether command line API should be available to the evaluated expression, defaults to false.
   */
  public EvaluateOnCallFrame includeCommandLineAPI(boolean v) {
    put("includeCommandLineAPI", v);
    return this;
  }

  /**
   * @param v Specifies whether evaluation should stop on exceptions and mute console. Overrides setPauseOnException state.
   */
  public EvaluateOnCallFrame doNotPauseOnExceptionsAndMuteConsole(boolean v) {
    put("doNotPauseOnExceptionsAndMuteConsole", v);
    return this;
  }

  /**
   * @param v Whether the result is expected to be a JSON object that should be sent by value.
   */
  public EvaluateOnCallFrame returnByValue(boolean v) {
    put("returnByValue", v);
    return this;
  }

  /**
   * @param v Whether preview should be generated for the result.
   */
  public EvaluateOnCallFrame generatePreview(boolean v) {
    put("generatePreview", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Debugger.evaluateOnCallFrame";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.EvaluateOnCallFrameData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerEvaluateOnCallFrameData(data.getDeferredReader());
  }
}