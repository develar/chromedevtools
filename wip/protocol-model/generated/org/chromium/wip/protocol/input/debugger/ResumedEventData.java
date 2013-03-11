// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * Fired when the virtual machine resumed execution.
 */
@org.chromium.protocolReader.JsonType
public interface ResumedEventData {

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.ResumedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.ResumedEventData>("Debuggerresumed", org.chromium.wip.protocol.input.debugger.ResumedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.debugger.ResumedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerResumedEventData(reader);
    }
  };
}