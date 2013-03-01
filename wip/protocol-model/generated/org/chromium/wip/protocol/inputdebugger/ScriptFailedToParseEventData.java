// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Fired when virtual machine fails to parse the script.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ScriptFailedToParseEventData {
  /**
   URL of the script that failed to parse.
   */
  String url();

  /**
   Source text of the script that failed to parse.
   */
  String scriptSource();

  /**
   Line offset of the script within the resource.
   */
  long startLine();

  /**
   Line with error.
   */
  long errorLine();

  /**
   Parse error message.
   */
  String errorMessage();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData>("DebuggerscriptFailedToParse", org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDebuggerScriptFailedToParseEventData(obj);
    }
  };
}
