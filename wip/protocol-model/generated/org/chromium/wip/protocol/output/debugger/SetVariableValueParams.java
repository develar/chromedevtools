// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.debugger;

/**
 * Changes value of variable in a callframe or a closure. Either callframe or function must be specified. Object-based scopes are not supported and must be mutated manually.
 */
public class SetVariableValueParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param scopeNumber 0-based number of scope as was listed in scope chain. Only 'local', 'closure' and 'catch' scope types are allowed. Other scopes could be manipulated manually.
   * @param variableName Variable name.
   * @param newValue New variable value.
   */
  public SetVariableValueParams(long scopeNumber, String variableName, org.chromium.wip.protocol.output.runtime.CallArgumentParam newValue) {
    put("scopeNumber", scopeNumber);
    put("variableName", variableName);
    put("newValue", newValue);
  }

  /**
   * @param v Id of callframe that holds variable.
   */
  public SetVariableValueParams callFrameId(String v) {
    put("callFrameId", v);
    return this;
  }

  /**
   * @param v Object id of closure (function) that holds variable.
   */
  public SetVariableValueParams functionObjectId(String v) {
    put("functionObjectId", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setVariableValue";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}