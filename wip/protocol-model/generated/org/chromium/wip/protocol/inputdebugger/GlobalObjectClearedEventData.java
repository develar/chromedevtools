// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Called when global has been cleared and debugger client should reset its state. Happens upon navigation or reload.
 */
@org.chromium.protocolParser.JsonType
public interface GlobalObjectClearedEventData {
  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData>("DebuggerglobalObjectCleared", org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseDebuggerGlobalObjectClearedEventData(reader);
    }
  };
}
