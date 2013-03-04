// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
 */
@org.chromium.protocolParser.JsonType
public interface ScriptParsedEventData {
  /**
   Identifier of the script parsed.
   */
  String scriptId();

  /**
   URL or name of the script parsed (if any).
   */
  String url();

  /**
   Line offset of the script within the resource with given URL (for script tags).
   */
  long startLine();

  /**
   Column offset of the script within the resource with given URL.
   */
  long startColumn();

  /**
   Last line of the script.
   */
  long endLine();

  /**
   Length of the last line of the script.
   */
  long endColumn();

  /**
   Determines whether this script is a user extension script.
   */
  @org.chromium.protocolParser.JsonOptionalField
  boolean isContentScript();

  /**
   URL of source map associated with script (if any).
   */
  @org.chromium.protocolParser.JsonOptionalField
  String sourceMapURL();

  /**
   True, if this script has sourceURL.
   */
  @org.chromium.protocolParser.JsonOptionalField
  boolean hasSourceURL();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.ScriptParsedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.ScriptParsedEventData>("DebuggerscriptParsed", org.chromium.wip.protocol.inputdebugger.ScriptParsedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.ScriptParsedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseDebuggerScriptParsedEventData(reader);
    }
  };
}
