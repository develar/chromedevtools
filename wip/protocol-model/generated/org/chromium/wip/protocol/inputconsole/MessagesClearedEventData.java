// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputconsole;

/**
 Issued when console is cleared. This happens either upon <code>clearMessages</code> command or after page navigation.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface MessagesClearedEventData {
  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputconsole.MessagesClearedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputconsole.MessagesClearedEventData>("ConsolemessagesCleared", org.chromium.wip.protocol.inputconsole.MessagesClearedEventData.class) {
    @Override public org.chromium.wip.protocol.inputconsole.MessagesClearedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseConsoleMessagesClearedEventData(obj);
    }
  };
}
