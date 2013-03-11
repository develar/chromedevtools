// Generated source
package org.chromium.wip.protocol.input.console;

/**
 * Issued when console is cleared. This happens either upon <code>clearMessages</code> command or after page navigation.
 */
@org.chromium.protocolReader.JsonType
public interface MessagesClearedEventData {

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.console.MessagesClearedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.console.MessagesClearedEventData>("ConsolemessagesCleared", org.chromium.wip.protocol.input.console.MessagesClearedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.console.MessagesClearedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readConsoleMessagesClearedEventData(reader);
    }
  };
}