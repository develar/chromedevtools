// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Fired when the virtual machine resumed execution.
 */
@org.chromium.protocolParser.JsonType
public interface ResumedEventData {
  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.ResumedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.ResumedEventData>("Debuggerresumed", org.chromium.wip.protocol.inputdebugger.ResumedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.ResumedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDebuggerResumedEventData(reader);
    }
  };
}
