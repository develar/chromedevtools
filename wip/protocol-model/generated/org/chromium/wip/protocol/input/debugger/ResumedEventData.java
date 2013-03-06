// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * Fired when the virtual machine resumed execution.
 */
@org.chromium.protocolParser.JsonType
public interface ResumedEventData {

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.ResumedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.ResumedEventData>("Debuggerresumed", org.chromium.wip.protocol.input.debugger.ResumedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.debugger.ResumedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDebuggerResumedEventData(reader);
    }
  };
}