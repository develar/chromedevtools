// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Returns source for the script with given id.
 */
public class GetScriptSourceParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.GetScriptSourceData> {
  /**
   @param scriptId Id of the script to get source for.
   */
  public GetScriptSourceParams(String/*See org.chromium.wip.protocol.commondebugger.ScriptIdTypedef*/ scriptId) {
    this.put("scriptId", scriptId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".getScriptSource";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.GetScriptSourceData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parseDebuggerGetScriptSourceData(data.getUnderlyingObject());
  }

}
