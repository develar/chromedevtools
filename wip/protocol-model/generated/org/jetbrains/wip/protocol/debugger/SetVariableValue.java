// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Changes value of variable in a callframe or a closure. Either callframe or function must be specified. Object-based scopes are not supported and must be mutated manually.
 */
public final class SetVariableValue extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param scopeNumber 0-based number of scope as was listed in scope chain. Only 'local', 'closure' and 'catch' scope types are allowed. Other scopes could be manipulated manually.
   * @param variableName Variable name.
   * @param newValue New variable value.
   */
  public SetVariableValue(int scopeNumber, String variableName, org.jetbrains.wip.protocol.runtime.CallArgument newValue) {
    writeInt("scopeNumber", scopeNumber);
    writeString("variableName", variableName);
    writeMessage("newValue", newValue);
  }

  /**
   * @param v Id of callframe that holds variable.
   */
  public SetVariableValue callFrameId(String v) {
    if (v != null) {
      writeString("callFrameId", v);
    }
    return this;
  }

  /**
   * @param v Object id of closure (function) that holds variable.
   */
  public SetVariableValue functionObjectId(String v) {
    if (v != null) {
      writeString("functionObjectId", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "Debugger.setVariableValue";
  }
}