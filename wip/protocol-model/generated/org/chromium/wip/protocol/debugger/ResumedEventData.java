// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Fired when the virtual machine resumed execution.
 */
@org.chromium.protocolReader.JsonType
public interface ResumedEventData {

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.debugger.ResumedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.debugger.ResumedEventData>("Debuggerresumed", org.chromium.wip.protocol.debugger.ResumedEventData.class) {
    @Override
    public org.chromium.wip.protocol.debugger.ResumedEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerResumedEventData(reader);
    }
  };
}