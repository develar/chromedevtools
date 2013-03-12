// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Compiles expression.
 */
@org.chromium.protocolReader.JsonType
public interface CompileScriptResult {
  /**
   * Id of the script.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String scriptId();
  /**
   * Syntax error message if compilation failed.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String syntaxErrorMessage();

}