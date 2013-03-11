// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Evaluates expression on global object.
 */
public final class Evaluate extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.runtime.EvaluateData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param expression Expression to evaluate.
   */
  public Evaluate(String expression) {
    writeString("expression", expression);
  }

  /**
   * @param v Symbolic group name that can be used to release multiple objects.
   */
  public Evaluate objectGroup(String v) {
    if (v != null) {
      writeString("objectGroup", v);
    }
    return this;
  }

  /**
   * @param v Determines whether Command Line API should be available during the evaluation.
   */
  public Evaluate includeCommandLineAPI(boolean v) {
    writeBoolean("includeCommandLineAPI", v);
    return this;
  }

  /**
   * @param v Specifies whether evaluation should stop on exceptions and mute console. Overrides setPauseOnException state.
   */
  public Evaluate doNotPauseOnExceptionsAndMuteConsole(boolean v) {
    writeBoolean("doNotPauseOnExceptionsAndMuteConsole", v);
    return this;
  }

  /**
   * @param v Specifies in which isolated context to perform evaluation. Each content script lives in an isolated context and this parameter may be used to specify one of those contexts. If the parameter is omitted or 0 the evaluation will be performed in the context of the inspected page.
   */
  public Evaluate contextId(int v) {
    writeInt("contextId", v);
    return this;
  }

  /**
   * @param v Whether the result is expected to be a JSON object that should be sent by value.
   */
  public Evaluate returnByValue(boolean v) {
    writeBoolean("returnByValue", v);
    return this;
  }

  /**
   * @param v Whether preview should be generated for the result.
   */
  public Evaluate generatePreview(boolean v) {
    writeBoolean("generatePreview", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Runtime.evaluate";
  }

  @Override
  public org.chromium.wip.protocol.input.runtime.EvaluateData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseRuntimeEvaluateData(data.getDeferredReader());
  }
}