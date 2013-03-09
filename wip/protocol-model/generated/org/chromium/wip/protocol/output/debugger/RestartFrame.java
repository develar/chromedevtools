// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Restarts particular call frame from the beginning.
 */
public final class RestartFrame extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.RestartFrameData> {
  /**
   * @param callFrameId Call frame identifier to evaluate on.
   */
  public RestartFrame(String callFrameId) {
    put("callFrameId", callFrameId);
  }
  @Override
  public String getMethodName() {
    return "Debugger.restartFrame";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.RestartFrameData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerRestartFrameData(data.getDeferredReader());
  }
}