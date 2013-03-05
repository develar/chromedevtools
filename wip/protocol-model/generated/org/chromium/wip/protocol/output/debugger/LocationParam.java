// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.debugger;

/**
Location in the source code.
 */
public class LocationParam extends org.jetbrains.jsonProtocol.OutMessage {
  /**
   * @param scriptId Script identifier as reported in the <code>Debugger.scriptParsed</code>.
   * @param lineNumber Line number in the script.
   */
  public LocationParam(String scriptId, long lineNumber) {
    put("scriptId", scriptId);
    put("lineNumber", lineNumber);
  }

  /**
   * @param v Column number in the script.
   */
  public LocationParam columnNumber(long v) {
    put("columnNumber", v);
    return this;
  }
}