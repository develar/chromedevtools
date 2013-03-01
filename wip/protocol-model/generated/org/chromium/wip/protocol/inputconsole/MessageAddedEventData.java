// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputconsole;

/**
 Issued when new console message is added.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface MessageAddedEventData {
  /**
   Console message that has been added.
   */
  org.chromium.wip.protocol.inputconsole.ConsoleMessageValue message();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputconsole.MessageAddedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputconsole.MessageAddedEventData>("ConsolemessageAdded", org.chromium.wip.protocol.inputconsole.MessageAddedEventData.class) {
    @Override public org.chromium.wip.protocol.inputconsole.MessageAddedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseConsoleMessageAddedEventData(obj);
    }
  };
}
