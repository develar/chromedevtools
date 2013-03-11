// Generated source
package org.chromium.wip.protocol.input.debugger;

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

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.ScriptFailedToParseEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.ScriptFailedToParseEventData>("DebuggerscriptFailedToParse", org.chromium.wip.protocol.input.debugger.ScriptFailedToParseEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.debugger.ScriptFailedToParseEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseDebuggerScriptFailedToParseEventData(reader);
    }
  };
}