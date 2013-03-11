// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * Called when global has been cleared and debugger client should reset its state. Happens upon navigation or reload.
 */
@org.chromium.protocolReader.JsonType
public interface GlobalObjectClearedEventData {

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.GlobalObjectClearedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.GlobalObjectClearedEventData>("DebuggerglobalObjectCleared", org.chromium.wip.protocol.input.debugger.GlobalObjectClearedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.debugger.GlobalObjectClearedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerGlobalObjectClearedEventData(reader);
    }
  };
}