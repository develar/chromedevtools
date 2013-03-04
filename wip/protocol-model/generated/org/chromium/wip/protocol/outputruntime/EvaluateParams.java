// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputruntime;

/**
Evaluates expression on global object.
 */
public class EvaluateParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputruntime.EvaluateData> {
  /**
   @param expression Expression to evaluate.
   @param objectGroupOpt Symbolic group name that can be used to release multiple objects.
   @param includeCommandLineAPIOpt Determines whether Command Line API should be available during the evaluation.
   @param doNotPauseOnExceptionsAndMuteConsoleOpt Specifies whether evaluation should stop on exceptions and mute console. Overrides setPauseOnException state.
   @param contextIdOpt Specifies in which isolated context to perform evaluation. Each content script lives in an isolated context and this parameter may be used to specify one of those contexts. If the parameter is omitted or 0 the evaluation will be performed in the context of the inspected page.
   @param returnByValueOpt Whether the result is expected to be a JSON object that should be sent by value.
   @param generatePreviewOpt Whether preview should be generated for the result.
   */
  public EvaluateParams(String expression, String objectGroupOpt, boolean includeCommandLineAPIOpt, boolean doNotPauseOnExceptionsAndMuteConsoleOpt, long contextIdOpt, boolean returnByValueOpt, boolean generatePreviewOpt) {
    //this.put("expression", expression);
    //this.put("objectGroup", objectGroupOpt);
    //this.put("includeCommandLineAPI", includeCommandLineAPIOpt);
    //this.put("doNotPauseOnExceptionsAndMuteConsole", doNotPauseOnExceptionsAndMuteConsoleOpt);
    //this.put("contextId", contextIdOpt);
    //this.put("returnByValue", returnByValueOpt);
    //this.put("generatePreview", generatePreviewOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.RUNTIME + ".evaluate";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputruntime.EvaluateData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.WipGeneratedParserRoot parser) {
    return parser.parseRuntimeEvaluateData(data.getUnderlyingObject());
  }

}
