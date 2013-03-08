// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
 */
@org.chromium.protocolReader.JsonType
public interface ScriptParsedEventData {
  /**
   * Identifier of the script parsed.
   */
  String scriptId();
  /**
   * URL or name of the script parsed (if any).
   */
  String url();
  /**
   * Line offset of the script within the resource with given URL (for script tags).
   */
  int startLine();
  /**
   * Column offset of the script within the resource with given URL.
   */
  int startColumn();
  /**
   * Last line of the script.
   */
  int endLine();
  /**
   * Length of the last line of the script.
   */
  int endColumn();
  /**
   * Determines whether this script is a user extension script.
   */
  @org.chromium.protocolReader.JsonOptionalField
  boolean isContentScript();
  /**
   * URL of source map associated with script (if any).
   */
  @org.chromium.protocolReader.JsonOptionalField
  String sourceMapURL();
  /**
   * True, if this script has sourceURL.
   */
  @org.chromium.protocolReader.JsonOptionalField
  boolean hasSourceURL();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.ScriptParsedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.ScriptParsedEventData>("DebuggerscriptParsed", org.chromium.wip.protocol.input.debugger.ScriptParsedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.debugger.ScriptParsedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDebuggerScriptParsedEventData(reader);
    }
  };
}