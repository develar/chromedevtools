// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Location in the source code.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface LocationValue {
  /**
   Script identifier as reported in the <code>Debugger.scriptParsed</code>.
   */
  String/*See org.chromium.wip.protocol.commondebugger.ScriptIdTypedef*/ scriptId();

  /**
   Line number in the script.
   */
  long lineNumber();

  /**
   Column number in the script.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Long columnNumber();

}
