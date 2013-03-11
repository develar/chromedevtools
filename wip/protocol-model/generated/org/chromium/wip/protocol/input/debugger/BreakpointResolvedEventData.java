// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * Fired when breakpoint is resolved to an actual script and location.
 */
@org.chromium.protocolReader.JsonType
public interface BreakpointResolvedEventData {
  /**
   * Breakpoint unique identifier.
   */
  String breakpointId();
  /**
   * Actual breakpoint location.
   */
  org.chromium.wip.protocol.input.debugger.LocationValue location();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData>("DebuggerbreakpointResolved", org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData parse(org.chromium.wip.protocol.input.ProtocolReponseReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseDebuggerBreakpointResolvedEventData(reader);
    }
  };
}