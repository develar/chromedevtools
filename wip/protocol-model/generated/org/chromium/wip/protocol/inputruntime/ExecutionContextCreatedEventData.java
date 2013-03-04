// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputruntime;

/**
 Issued when new execution context is created.
 */
@org.chromium.protocolParser.JsonType
public interface ExecutionContextCreatedEventData {
  /**
   A newly created execution contex.
   */
  org.chromium.wip.protocol.inputruntime.ExecutionContextDescriptionValue context();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputruntime.ExecutionContextCreatedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputruntime.ExecutionContextCreatedEventData>("RuntimeexecutionContextCreated", org.chromium.wip.protocol.inputruntime.ExecutionContextCreatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputruntime.ExecutionContextCreatedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseRuntimeExecutionContextCreatedEventData(reader);
    }
  };
}
