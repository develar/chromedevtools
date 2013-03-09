// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Evaluates expression on global object.
 */
public final class Evaluate extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.runtime.EvaluateData> {
  /**
   * @param expression Expression to evaluate.
   */
  public Evaluate(String expression) {
    put("expression", expression);
  }

  /**
   * @param v Symbolic group name that can be used to release multiple objects.
   */
  public Evaluate objectGroup(String v) {
    if (v != null) {
      put("objectGroup", v);
    }
    return this;
  }

  /**
   * @param v Determines whether Command Line API should be available during the evaluation.
   */
  public Evaluate includeCommandLineAPI(boolean v) {
    put("includeCommandLineAPI", v);
    return this;
  }

  /**
   * @param v Specifies whether evaluation should stop on exceptions and mute console. Overrides setPauseOnException state.
   */
  public Evaluate doNotPauseOnExceptionsAndMuteConsole(boolean v) {
    put("doNotPauseOnExceptionsAndMuteConsole", v);
    return this;
  }

  /**
   * @param v Specifies in which isolated context to perform evaluation. Each content script lives in an isolated context and this parameter may be used to specify one of those contexts. If the parameter is omitted or 0 the evaluation will be performed in the context of the inspected page.
   */
  public Evaluate contextId(int v) {
    put("contextId", v);
    return this;
  }

  /**
   * @param v Whether the result is expected to be a JSON object that should be sent by value.
   */
  public Evaluate returnByValue(boolean v) {
    put("returnByValue", v);
    return this;
  }

  /**
   * @param v Whether preview should be generated for the result.
   */
  public Evaluate generatePreview(boolean v) {
    put("generatePreview", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Runtime.evaluate";
  }

  @Override
  public org.chromium.wip.protocol.input.runtime.EvaluateData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseRuntimeEvaluateData(data.getDeferredReader());
  }
}