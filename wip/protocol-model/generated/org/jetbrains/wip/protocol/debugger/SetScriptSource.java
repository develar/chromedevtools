// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Edits JavaScript source live.
 */
public final class SetScriptSource extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.debugger.SetScriptSourceResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
  /**
   * @param scriptId Id of the script to edit.
   * @param scriptSource New content of the script.
   */
  public SetScriptSource(String scriptId, String scriptSource) {
    writeString("scriptId", scriptId);
    writeString("scriptSource", scriptSource);
  }

  /**
   * @param v  If true the change will not actually be applied. Preview mode may be used to get result description without actually modifying the code.
   */
  public SetScriptSource preview(boolean v) {
    writeBoolean("preview", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Debugger.setScriptSource";
  }

  @Override
  public SetScriptSourceResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerSetScriptSourceResult(jsonReader);
  }
}