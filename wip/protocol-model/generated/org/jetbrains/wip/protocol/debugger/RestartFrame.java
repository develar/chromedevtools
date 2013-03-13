// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Restarts particular call frame from the beginning.
 */
public final class RestartFrame extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.debugger.RestartFrameResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
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
  public RestartFrameResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerRestartFrameResult(jsonReader);
  }
}