// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
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
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Data data();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdebugger.PausedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdebugger.PausedEventData>("Debuggerpaused", org.chromium.wip.protocol.inputdebugger.PausedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.PausedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDebuggerPausedEventData(obj);
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
  @org.chromium.sdk.internal.protocolparser.JsonType(allowsOtherProperties=true)
  public interface Data extends org.chromium.sdk.internal.protocolparser.JsonObjectBased {
  }
}
