// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Fired when the virtual machine resumed execution.
 */
@org.chromium.protocolReader.JsonType
public interface ResumedEventData {

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.debugger.ResumedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.debugger.ResumedEventData>("Debuggerresumed", org.jetbrains.wip.protocol.debugger.ResumedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.debugger.ResumedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerResumedEventData(reader);
    }
  };
}