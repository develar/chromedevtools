// Generated source
package org.jetbrains.wip.protocol.console;

/**
 * Issued when subsequent message(s) are equal to the previous one(s).
 */
@org.chromium.protocolReader.JsonType
public interface MessageRepeatCountUpdatedEventData {
  /**
   * New repeat count value.
   */
  int count();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.console.MessageRepeatCountUpdatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.console.MessageRepeatCountUpdatedEventData>("ConsolemessageRepeatCountUpdated", org.jetbrains.wip.protocol.console.MessageRepeatCountUpdatedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.console.MessageRepeatCountUpdatedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readConsoleMessageRepeatCountUpdatedEventData(reader);
    }
  };
}