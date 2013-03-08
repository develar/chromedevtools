// Generated source
package org.chromium.wip.protocol.input.console;

/**
 * Issued when new console message is added.
 */
@org.chromium.protocolReader.JsonType
public interface MessageAddedEventData {
  /**
   * Console message that has been added.
   */
  org.chromium.wip.protocol.input.console.ConsoleMessageValue message();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.console.MessageAddedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.console.MessageAddedEventData>("ConsolemessageAdded", org.chromium.wip.protocol.input.console.MessageAddedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.console.MessageAddedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseConsoleMessageAddedEventData(reader);
    }
  };
}