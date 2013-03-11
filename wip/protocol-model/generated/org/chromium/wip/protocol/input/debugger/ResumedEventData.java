// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * Fired when the virtual machine resumed execution.
 */
@org.chromium.protocolReader.JsonType
public interface ResumedEventData {

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.ResumedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.ResumedEventData>("Debuggerresumed", org.chromium.wip.protocol.input.debugger.ResumedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.debugger.ResumedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseDebuggerResumedEventData(reader);
    }
  };
}