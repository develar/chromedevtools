// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Restarts particular call frame from the beginning.
 */
public final class RestartFrame extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.debugger.RestartFrameData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param callFrameId Call frame identifier to evaluate on.
   */
  public RestartFrame(String callFrameId) {
    writeString("callFrameId", callFrameId);
  }
  @Override
  public String getMethodName() {
    return "Debugger.restartFrame";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.RestartFrameData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDebuggerRestartFrameData(data.getDeferredReader());
  }
}