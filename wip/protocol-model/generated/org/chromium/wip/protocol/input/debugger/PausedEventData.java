// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
 */
@org.chromium.protocolReader.JsonType
public interface PausedEventData {
  /**
   * Call stack the virtual machine stopped on.
   */
  java.util.List<org.chromium.wip.protocol.input.debugger.CallFrameValue> callFrames();
  /**
   * Pause reason.
   */
  Reason reason();
  /**
   * Object containing break-specific auxiliary properties.
   */
  @org.chromium.protocolReader.JsonOptionalField
  Data data();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.PausedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.PausedEventData>("Debuggerpaused", org.chromium.wip.protocol.input.debugger.PausedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.debugger.PausedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
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