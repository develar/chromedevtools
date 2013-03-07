// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Compiles expression.
 */
public class CompileScriptParams extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.CompileScriptData> {
  /**
   * @param expression Expression to compile.
   * @param sourceURL Source url to be set for the script.
   */
  public CompileScriptParams(String expression, String sourceURL) {
    put("expression", expression);
    put("sourceURL", sourceURL);
  }
  @Override
  public String getMethodName() {
    return "Debugger.compileScript";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.CompileScriptData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerCompileScriptData(data.getDeferredReader());
  }
}