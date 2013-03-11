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

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.console.MessageAddedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.console.MessageAddedEventData>("ConsolemessageAdded", org.chromium.wip.protocol.input.console.MessageAddedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.console.MessageAddedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readConsoleMessageAddedEventData(reader);
    }
  };
}