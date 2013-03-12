// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Fired when virtual machine fails to parse the script.
 */
@org.chromium.protocolReader.JsonType
public interface ScriptFailedToParseEventData {
  /**
   * URL of the script that failed to parse.
   */
  String url();
  /**
   * Source text of the script that failed to parse.
   */
  String scriptSource();
  /**
   * Line offset of the script within the resource.
   */
  int startLine();
  /**
   * Line with error.
   */
  int errorLine();
  /**
   * Parse error message.
   */
  String errorMessage();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.debugger.ScriptFailedToParseEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.debugger.ScriptFailedToParseEventData>("DebuggerscriptFailedToParse", org.chromium.wip.protocol.debugger.ScriptFailedToParseEventData.class) {
    @Override
    public org.chromium.wip.protocol.debugger.ScriptFailedToParseEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerScriptFailedToParseEventData(reader);
    }
  };
}