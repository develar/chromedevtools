// Generated source
package org.chromium.wip.protocol.input.runtime;

/**
 * Issued when new execution context is created.
 */
@org.chromium.protocolReader.JsonType
public interface ExecutionContextCreatedEventData {
  /**
   * A newly created execution contex.
   */
  org.chromium.wip.protocol.input.runtime.ExecutionContextDescriptionValue context();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.runtime.ExecutionContextCreatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.runtime.ExecutionContextCreatedEventData>("RuntimeexecutionContextCreated", org.chromium.wip.protocol.input.runtime.ExecutionContextCreatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.runtime.ExecutionContextCreatedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readRuntimeExecutionContextCreatedEventData(reader);
    }
  };
}