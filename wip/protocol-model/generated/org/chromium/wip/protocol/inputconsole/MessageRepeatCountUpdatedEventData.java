// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputconsole;

/**
 Issued when subsequent message(s) are equal to the previous one(s).
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface MessageRepeatCountUpdatedEventData {
  /**
   New repeat count value.
   */
  long count();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData>("ConsolemessageRepeatCountUpdated", org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseConsoleMessageRepeatCountUpdatedEventData(obj);
    }
  };
}
