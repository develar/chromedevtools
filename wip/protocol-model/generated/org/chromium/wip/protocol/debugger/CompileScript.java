// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Compiles expression.
 */
public final class CompileScript extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.debugger.CompileScriptResult, org.chromium.wip.protocol.ProtocolReponseReader> {
  /**
   * @param expression Expression to compile.
   * @param sourceURL Source url to be set for the script.
   */
  public CompileScript(String expression, String sourceURL) {
    writeString("expression", expression);
    writeString("sourceURL", sourceURL);
  }
  @Override
  public String getMethodName() {
    return "Debugger.compileScript";
  }

  @Override
  public CompileScriptResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerCompileScriptResult(jsonReader);
  }
}