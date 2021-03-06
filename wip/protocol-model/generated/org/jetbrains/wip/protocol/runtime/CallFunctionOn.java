// Generated source
package org.jetbrains.wip.protocol.runtime;

/**
 * Calls function with given declaration on the given object. Object group of the result is inherited from the target object.
 */
public final class CallFunctionOn extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.runtime.CallFunctionOnResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
  /**
   * @param objectId Identifier of the object to call function on.
   * @param functionDeclaration Declaration of the function to call.
   */
  public CallFunctionOn(String objectId, String functionDeclaration) {
    writeString("objectId", objectId);
    writeString("functionDeclaration", functionDeclaration);
  }

  /**
   * @param v Call arguments. All call arguments must belong to the same JavaScript world as the target object.
   */
  public CallFunctionOn arguments(java.util.List<org.jetbrains.wip.protocol.runtime.CallArgument> v) {
    writeList("arguments", v);
    return this;
  }

  /**
   * @param v Specifies whether function call should stop on exceptions and mute console. Overrides setPauseOnException state.
   */
  public CallFunctionOn doNotPauseOnExceptionsAndMuteConsole(boolean v) {
    writeBoolean("doNotPauseOnExceptionsAndMuteConsole", v);
    return this;
  }

  /**
   * @param v Whether the result is expected to be a JSON object which should be sent by value.
   */
  public CallFunctionOn returnByValue(boolean v) {
    writeBoolean("returnByValue", v);
    return this;
  }

  /**
   * @param v Whether preview should be generated for the result.
   */
  public CallFunctionOn generatePreview(boolean v) {
    writeBoolean("generatePreview", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Runtime.callFunctionOn";
  }

  @Override
  public CallFunctionOnResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readRuntimeCallFunctionOnResult(jsonReader);
  }
}