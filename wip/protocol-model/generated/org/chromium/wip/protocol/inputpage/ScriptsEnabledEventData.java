// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when the JavaScript is enabled/disabled on the page
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ScriptsEnabledEventData {
  /**
   Whether script execution is enabled or disabled on the page.
   */
  boolean isEnabled();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.ScriptsEnabledEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.ScriptsEnabledEventData>("PagescriptsEnabled", org.chromium.wip.protocol.inputpage.ScriptsEnabledEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.ScriptsEnabledEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageScriptsEnabledEventData(obj);
    }
  };
}
