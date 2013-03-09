// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Location in the source code.
 */
public final class Location extends org.jetbrains.jsonProtocol.OutMessage {
  /**
   * @param scriptId Script identifier as reported in the <code>Debugger.scriptParsed</code>.
   * @param lineNumber Line number in the script.
   */
  public Location(String scriptId, int lineNumber) {
    writeString("scriptId", scriptId);
    writeInt("lineNumber", lineNumber);
  }

  /**
   * @param v Column number in the script.
   */
  public Location columnNumber(int v) {
    if (v != -1) {
      writeInt("columnNumber", v);
    }
    return this;
  }
}