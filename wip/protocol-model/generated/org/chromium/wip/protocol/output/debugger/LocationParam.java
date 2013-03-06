// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Location in the source code.
 */
public class LocationParam extends org.jetbrains.jsonProtocol.OutMessage {
  /**
   * @param scriptId Script identifier as reported in the <code>Debugger.scriptParsed</code>.
   * @param lineNumber Line number in the script.
   */
  public LocationParam(String scriptId, int lineNumber) {
    put("scriptId", scriptId);
    put("lineNumber", lineNumber);
  }

  /**
   * @param v Column number in the script.
   */
  public LocationParam columnNumber(int v) {
    put("columnNumber", v);
    return this;
  }
}