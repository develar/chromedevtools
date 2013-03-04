// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Fired when virtual machine fails to parse the script.
 */
@org.chromium.protocolParser.JsonType
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

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData>("DebuggerscriptFailedToParse", org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDebuggerScriptFailedToParseEventData(reader);
    }
  };
}
