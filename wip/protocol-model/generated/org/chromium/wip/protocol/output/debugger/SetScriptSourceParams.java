// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Edits JavaScript source live.
 */
public class SetScriptSourceParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.debugger.SetScriptSourceData> {
  /**
   * @param scriptId Id of the script to edit.
   * @param scriptSource New content of the script.
   */
  public SetScriptSourceParams(String scriptId, String scriptSource) {
    put("scriptId", scriptId);
    put("scriptSource", scriptSource);
  }

  /**
   * @param v  If true the change will not actually be applied. Preview mode may be used to get result description without actually modifying the code.
   */
  public SetScriptSourceParams preview(boolean v) {
    put("preview", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setScriptSource";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SetScriptSourceData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerSetScriptSourceData(data.getUnderlyingObject());
  }
}