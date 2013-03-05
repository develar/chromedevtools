// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.debugger;

/**
 * Restarts particular call frame from the beginning.
 */
public class RestartFrameParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.debugger.RestartFrameData> {
  /**
   * @param callFrameId Call frame identifier to evaluate on.
   */
  public RestartFrameParams(String callFrameId) {
    put("callFrameId", callFrameId);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".restartFrame";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.RestartFrameData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerRestartFrameData(data.getUnderlyingObject());
  }

}