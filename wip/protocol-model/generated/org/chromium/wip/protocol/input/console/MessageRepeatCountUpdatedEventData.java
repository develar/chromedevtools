// Generated source
package org.chromium.wip.protocol.input.console;

/**
 * Issued when subsequent message(s) are equal to the previous one(s).
 */
@org.chromium.protocolReader.JsonType
public interface MessageRepeatCountUpdatedEventData {
  /**
   * New repeat count value.
   */
  int count();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.console.MessageRepeatCountUpdatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.console.MessageRepeatCountUpdatedEventData>("ConsolemessageRepeatCountUpdated", org.chromium.wip.protocol.input.console.MessageRepeatCountUpdatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.console.MessageRepeatCountUpdatedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readConsoleMessageRepeatCountUpdatedEventData(reader);
    }
  };
}