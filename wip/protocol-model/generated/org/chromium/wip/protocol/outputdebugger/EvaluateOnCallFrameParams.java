// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Evaluates expression on a given call frame.
 */
public class EvaluateOnCallFrameParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.EvaluateOnCallFrameData> {
  /**
   @param callFrameId Call frame identifier to evaluate on.
   @param expression Expression to evaluate.
   @param objectGroupOpt String object group name to put result into (allows rapid releasing resulting object handles using <code>releaseObjectGroup</code>).
   @param includeCommandLineAPIOpt Specifies whether command line API should be available to the evaluated expression, defaults to false.
   @param doNotPauseOnExceptionsAndMuteConsoleOpt Specifies whether evaluation should stop on exceptions and mute console. Overrides setPauseOnException state.
   @param returnByValueOpt Whether the result is expected to be a JSON object that should be sent by value.
   @param generatePreviewOpt Whether preview should be generated for the result.
   */
  public EvaluateOnCallFrameParams(String callFrameId, String expression, String objectGroupOpt, boolean includeCommandLineAPIOpt, boolean doNotPauseOnExceptionsAndMuteConsoleOpt, boolean returnByValueOpt, boolean generatePreviewOpt) {
    //this.put("callFrameId", callFrameId);
    //this.put("expression", expression);
    //this.put("objectGroup", objectGroupOpt);
    //this.put("includeCommandLineAPI", includeCommandLineAPIOpt);
    //this.put("doNotPauseOnExceptionsAndMuteConsole", doNotPauseOnExceptionsAndMuteConsoleOpt);
    //this.put("returnByValue", returnByValueOpt);
    //this.put("generatePreview", generatePreviewOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".evaluateOnCallFrame";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.EvaluateOnCallFrameData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerEvaluateOnCallFrameData(data.getUnderlyingObject());
  }

}
