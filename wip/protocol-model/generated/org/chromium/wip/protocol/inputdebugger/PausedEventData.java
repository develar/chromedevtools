// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
 */
@org.chromium.protocolParser.JsonType
public interface PausedEventData {
  /**
   Call stack the virtual machine stopped on.
   */
  java.util.List<org.chromium.wip.protocol.inputdebugger.CallFrameValue> callFrames();

  /**
   Pause reason.
   */
  Reason reason();

  /**
   Object containing break-specific auxiliary properties.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Data data();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.PausedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.PausedEventData>("Debuggerpaused", org.chromium.wip.protocol.inputdebugger.PausedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.PausedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDebuggerPausedEventData(reader);
    }
  };
  /**
   Pause reason.
   */
  public enum Reason {
    XHR,
    DOM,
    EVENTLISTENER,
    EXCEPTION,
    ASSERT,
    CSPVIOLATION,
    OTHER,
  }
  /**
   Object containing break-specific auxiliary properties.
   */
  @org.chromium.protocolParser.JsonType(allowsOtherProperties=true)
  public interface Data extends org.chromium.protocolParser.JsonObjectBased {
  }
}
