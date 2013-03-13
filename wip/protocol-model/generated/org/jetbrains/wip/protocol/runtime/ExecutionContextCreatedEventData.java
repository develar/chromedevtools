// Generated source
package org.jetbrains.wip.protocol.runtime;

/**
 * Issued when new execution context is created.
 */
@org.chromium.protocolReader.JsonType
public interface ExecutionContextCreatedEventData {
  /**
   * A newly created execution contex.
   */
  org.jetbrains.wip.protocol.runtime.ExecutionContextDescriptionValue context();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.runtime.ExecutionContextCreatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.runtime.ExecutionContextCreatedEventData>("RuntimeexecutionContextCreated", org.jetbrains.wip.protocol.runtime.ExecutionContextCreatedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.runtime.ExecutionContextCreatedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readRuntimeExecutionContextCreatedEventData(reader);
    }
  };
}