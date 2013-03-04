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
  public EvaluateOnCallFrameParams(String/*See org.chromium.wip.protocol.commondebugger.CallFrameIdTypedef*/ callFrameId, String expression, String objectGroupOpt, Boolean includeCommandLineAPIOpt, Boolean doNotPauseOnExceptionsAndMuteConsoleOpt, Boolean returnByValueOpt, Boolean generatePreviewOpt) {
    this.put("callFrameId", callFrameId);
    this.put("expression", expression);
    if (objectGroupOpt != null) {
      this.put("objectGroup", objectGroupOpt);
    }
    if (includeCommandLineAPIOpt != null) {
      this.put("includeCommandLineAPI", includeCommandLineAPIOpt);
    }
    if (doNotPauseOnExceptionsAndMuteConsoleOpt != null) {
      this.put("doNotPauseOnExceptionsAndMuteConsole", doNotPauseOnExceptionsAndMuteConsoleOpt);
    }
    if (returnByValueOpt != null) {
      this.put("returnByValue", returnByValueOpt);
    }
    if (generatePreviewOpt != null) {
      this.put("generatePreview", generatePreviewOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".evaluateOnCallFrame";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.EvaluateOnCallFrameData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parseDebuggerEvaluateOnCallFrameData(data.getUnderlyingObject());
  }

}
