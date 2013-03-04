// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputconsole;

/**
 Issued when new console message is added.
 */
@org.chromium.protocolParser.JsonType
public interface MessageAddedEventData {
  /**
   Console message that has been added.
   */
  org.chromium.wip.protocol.inputconsole.ConsoleMessageValue message();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputconsole.MessageAddedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputconsole.MessageAddedEventData>("ConsolemessageAdded", org.chromium.wip.protocol.inputconsole.MessageAddedEventData.class) {
    @Override public org.chromium.wip.protocol.inputconsole.MessageAddedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseConsoleMessageAddedEventData(reader);
    }
  };
}
