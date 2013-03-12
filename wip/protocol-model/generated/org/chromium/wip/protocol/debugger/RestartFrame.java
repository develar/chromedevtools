// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Restarts particular call frame from the beginning.
 */
public final class RestartFrame extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.debugger.RestartFrameResult, org.chromium.wip.protocol.ProtocolReponseReader> {
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
  public RestartFrameResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerRestartFrameResult(jsonReader);
  }
}