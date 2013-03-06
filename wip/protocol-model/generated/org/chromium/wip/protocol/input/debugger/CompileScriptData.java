// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.debugger;

/**
 * Compiles expression.
 */
@org.chromium.protocolParser.JsonType
public interface CompileScriptData {
  /**
   * Id of the script.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String scriptId();
  /**
   * Syntax error message if compilation failed.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String syntaxErrorMessage();

}