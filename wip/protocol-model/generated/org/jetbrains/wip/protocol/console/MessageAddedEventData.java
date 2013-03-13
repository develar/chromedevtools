// Generated source
package org.jetbrains.wip.protocol.console;

/**
 * Issued when new console message is added.
 */
@org.chromium.protocolReader.JsonType
public interface MessageAddedEventData {
  /**
   * Console message that has been added.
   */
  org.jetbrains.wip.protocol.console.ConsoleMessageValue message();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.console.MessageAddedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.console.MessageAddedEventData>("ConsolemessageAdded", org.jetbrains.wip.protocol.console.MessageAddedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.console.MessageAddedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readConsoleMessageAddedEventData(reader);
    }
  };
}