// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Compiles expression.
 */
public final class CompileScript extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.debugger.CompileScriptData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
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
  public org.chromium.wip.protocol.input.debugger.CompileScriptData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readDebuggerCompileScriptData(data.getDeferredReader());
  }
}