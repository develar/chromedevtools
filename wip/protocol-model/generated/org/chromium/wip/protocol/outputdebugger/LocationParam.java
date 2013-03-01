// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Location in the source code.
 */
public class LocationParam extends org.json.simple.JSONObject {
  /**
   @param scriptId Script identifier as reported in the <code>Debugger.scriptParsed</code>.
   @param lineNumber Line number in the script.
   @param columnNumberOpt Column number in the script.
   */
  public LocationParam(String/*See org.chromium.wip.protocol.commondebugger.ScriptIdTypedef*/ scriptId, long lineNumber, Long columnNumberOpt) {
    this.put("scriptId", scriptId);
    this.put("lineNumber", lineNumber);
    if (columnNumberOpt != null) {
      this.put("columnNumber", columnNumberOpt);
    }
  }

}
