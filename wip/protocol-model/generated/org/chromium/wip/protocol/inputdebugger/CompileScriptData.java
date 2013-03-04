// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Compiles expression.
 */
@org.chromium.protocolParser.JsonType
public interface CompileScriptData {
  /**
   Id of the script.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String/*See org.chromium.wip.protocol.commondebugger.ScriptIdTypedef*/ scriptId();

  /**
   Syntax error message if compilation failed.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String syntaxErrorMessage();

}
