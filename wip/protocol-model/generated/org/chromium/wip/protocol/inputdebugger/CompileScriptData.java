// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Compiles expression.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CompileScriptData {
  /**
   Id of the script.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String/*See org.chromium.wip.protocol.commondebugger.ScriptIdTypedef*/ scriptId();

  /**
   Syntax error message if compilation failed.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String syntaxErrorMessage();

}
