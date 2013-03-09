// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Calls function with given declaration on the given object. Object group of the result is inherited from the target object.
 */
public final class CallFunctionOn extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.runtime.CallFunctionOnData> {
  /**
   * @param objectId Identifier of the object to call function on.
   * @param functionDeclaration Declaration of the function to call.
   */
  public CallFunctionOn(String objectId, String functionDeclaration) {
    put("objectId", objectId);
    put("functionDeclaration", functionDeclaration);
  }

  /**
   * @param v Call arguments. All call arguments must belong to the same JavaScript world as the target object.
   */
  public CallFunctionOn arguments(java.util.List<org.chromium.wip.protocol.output.runtime.CallArgument> v) {
    put("arguments", v);
    return this;
  }

  /**
   * @param v Specifies whether function call should stop on exceptions and mute console. Overrides setPauseOnException state.
   */
  public CallFunctionOn doNotPauseOnExceptionsAndMuteConsole(boolean v) {
    put("doNotPauseOnExceptionsAndMuteConsole", v);
    return this;
  }

  /**
   * @param v Whether the result is expected to be a JSON object which should be sent by value.
   */
  public CallFunctionOn returnByValue(boolean v) {
    put("returnByValue", v);
    return this;
  }

  /**
   * @param v Whether preview should be generated for the result.
   */
  public CallFunctionOn generatePreview(boolean v) {
    put("generatePreview", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Runtime.callFunctionOn";
  }

  @Override
  public org.chromium.wip.protocol.input.runtime.CallFunctionOnData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseRuntimeCallFunctionOnData(data.getDeferredReader());
  }
}