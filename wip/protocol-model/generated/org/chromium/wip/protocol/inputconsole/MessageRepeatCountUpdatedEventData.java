// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputconsole;

/**
 Issued when subsequent message(s) are equal to the previous one(s).
 */
@org.chromium.protocolParser.JsonType
public interface MessageRepeatCountUpdatedEventData {
  /**
   New repeat count value.
   */
  long count();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData>("ConsolemessageRepeatCountUpdated", org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseConsoleMessageRepeatCountUpdatedEventData(reader);
    }
  };
}
