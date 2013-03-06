// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Tells whether <code>setScriptSource</code> is supported.
 */
public class CanSetScriptSourceParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.debugger.CanSetScriptSourceData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".canSetScriptSource";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.CanSetScriptSourceData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerCanSetScriptSourceData(data.getUnderlyingObject());
  }
}