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
  public CallFunctionOnParams(String objectId, String functionDeclaration, java.util.List<org.chromium.wip.protocol.outputruntime.CallArgumentParam> argumentsOpt, boolean doNotPauseOnExceptionsAndMuteConsoleOpt, boolean returnByValueOpt, boolean generatePreviewOpt) {
    //this.put("objectId", objectId);
    //this.put("functionDeclaration", functionDeclaration);
    //this.put("arguments", argumentsOpt);
    //this.put("doNotPauseOnExceptionsAndMuteConsole", doNotPauseOnExceptionsAndMuteConsoleOpt);
    //this.put("returnByValue", returnByValueOpt);
    //this.put("generatePreview", generatePreviewOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.RUNTIME + ".callFunctionOn";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputruntime.CallFunctionOnData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseRuntimeCallFunctionOnData(data.getUnderlyingObject());
  }

}
