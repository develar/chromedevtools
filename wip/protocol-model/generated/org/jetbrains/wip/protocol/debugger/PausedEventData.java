// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
 */
@org.chromium.protocolReader.JsonType
public interface PausedEventData {
  /**
   * Call stack the virtual machine stopped on.
   */
  java.util.List<org.jetbrains.wip.protocol.debugger.CallFrameValue> callFrames();
  /**
   * Pause reason.
   */
  Reason reason();
  /**
   * Object containing break-specific auxiliary properties.
   */
  @org.chromium.protocolReader.JsonOptionalField
  Data data();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.debugger.PausedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.debugger.PausedEventData>("Debuggerpaused", org.jetbrains.wip.protocol.debugger.PausedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.debugger.PausedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerPausedEventData(reader);
    }
  };
  /**
   * Pause reason.
   */
  public enum Reason {
    XHR, DOM, _EVENT_LISTENER, EXCEPTION, ASSERT, CSP_VIOLATION, OTHER
  }
  /**
   * Object containing break-specific auxiliary properties.
   */
  @org.chromium.protocolReader.JsonType(allowsOtherProperties=true)
  public interface Data extends org.jetbrains.jsonProtocol.JsonObjectBased {

  }
}