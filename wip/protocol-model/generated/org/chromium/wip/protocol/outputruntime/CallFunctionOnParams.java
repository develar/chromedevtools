// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputruntime;

/**
Calls function with given declaration on the given object. Object group of the result is inherited from the target object.
 */
public class CallFunctionOnParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputruntime.CallFunctionOnData> {
  /**
   @param objectId Identifier of the object to call function on.
   @param functionDeclaration Declaration of the function to call.
   @param argumentsOpt Call arguments. All call arguments must belong to the same JavaScript world as the target object.
   @param doNotPauseOnExceptionsAndMuteConsoleOpt Specifies whether function call should stop on exceptions and mute console. Overrides setPauseOnException state.
   @param returnByValueOpt Whether the result is expected to be a JSON object which should be sent by value.
   @param generatePreviewOpt Whether preview should be generated for the result.
   */
  public CallFunctionOnParams(String/*See org.chromium.wip.protocol.commonruntime.RemoteObjectIdTypedef*/ objectId, String functionDeclaration, java.util.List<org.chromium.wip.protocol.outputruntime.CallArgumentParam> argumentsOpt, Boolean doNotPauseOnExceptionsAndMuteConsoleOpt, Boolean returnByValueOpt, Boolean generatePreviewOpt) {
    this.put("objectId", objectId);
    this.put("functionDeclaration", functionDeclaration);
    if (argumentsOpt != null) {
      this.put("arguments", argumentsOpt);
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

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.RUNTIME + ".callFunctionOn";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputruntime.CallFunctionOnData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parseRuntimeCallFunctionOnData(data.getUnderlyingObject());
  }

}
