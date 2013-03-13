// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Location in the source code.
 */
@org.chromium.protocolReader.JsonType
public interface LocationValue {
  /**
   * Script identifier as reported in the <code>Debugger.scriptParsed</code>.
   */
  String scriptId();
  /**
   * Line number in the script.
   */
  int lineNumber();
  /**
   * Column number in the script.
   */
  @org.chromium.protocolReader.JsonOptionalField
  int columnNumber();

}