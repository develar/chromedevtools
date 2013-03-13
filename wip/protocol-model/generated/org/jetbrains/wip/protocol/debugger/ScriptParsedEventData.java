// Generated source
package org.jetbrains.wip.protocol.debugger;

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

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.debugger.ScriptParsedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.debugger.ScriptParsedEventData>("DebuggerscriptParsed", org.jetbrains.wip.protocol.debugger.ScriptParsedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.debugger.ScriptParsedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerScriptParsedEventData(reader);
    }
  };
}