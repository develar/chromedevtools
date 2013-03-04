// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Changes value of variable in a callframe or a closure. Either callframe or function must be specified. Object-based scopes are not supported and must be mutated manually.
 */
public class SetVariableValueParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param scopeNumber 0-based number of scope as was listed in scope chain. Only 'local', 'closure' and 'catch' scope types are allowed. Other scopes could be manipulated manually.
   @param variableName Variable name.
   @param newValue New variable value.
   @param callFrameIdOpt Id of callframe that holds variable.
   @param functionObjectIdOpt Object id of closure (function) that holds variable.
   */
  public SetVariableValueParams(long scopeNumber, String variableName, org.chromium.wip.protocol.outputruntime.CallArgumentParam newValue, String/*See org.chromium.wip.protocol.commondebugger.CallFrameIdTypedef*/ callFrameIdOpt, String/*See org.chromium.wip.protocol.commonruntime.RemoteObjectIdTypedef*/ functionObjectIdOpt) {
    this.put("scopeNumber", scopeNumber);
    this.put("variableName", variableName);
    this.put("newValue", newValue);
    if (callFrameIdOpt != null) {
      this.put("callFrameId", callFrameIdOpt);
    }
    if (functionObjectIdOpt != null) {
      this.put("functionObjectId", functionObjectIdOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setVariableValue";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
