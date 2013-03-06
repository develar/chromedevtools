// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Returns source for the script with given id.
 */
public class GetScriptSourceParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.debugger.GetScriptSourceData> {
  /**
   * @param scriptId Id of the script to get source for.
   */
  public GetScriptSourceParams(String scriptId) {
    put("scriptId", scriptId);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".getScriptSource";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.GetScriptSourceData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerGetScriptSourceData(data.getUnderlyingObject());
  }
}