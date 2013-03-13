// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Called when global has been cleared and debugger client should reset its state. Happens upon navigation or reload.
 */
@org.chromium.protocolReader.JsonType
public interface GlobalObjectClearedEventData {

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.debugger.GlobalObjectClearedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.debugger.GlobalObjectClearedEventData>("DebuggerglobalObjectCleared", org.jetbrains.wip.protocol.debugger.GlobalObjectClearedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.debugger.GlobalObjectClearedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerGlobalObjectClearedEventData(reader);
    }
  };
}