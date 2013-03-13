// Generated source
package org.jetbrains.wip.protocol.console;

/**
 * Issued when console is cleared. This happens either upon <code>clearMessages</code> command or after page navigation.
 */
@org.chromium.protocolReader.JsonType
public interface MessagesClearedEventData {

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.console.MessagesClearedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.console.MessagesClearedEventData>("ConsolemessagesCleared", org.jetbrains.wip.protocol.console.MessagesClearedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.console.MessagesClearedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readConsoleMessagesClearedEventData(reader);
    }
  };
}