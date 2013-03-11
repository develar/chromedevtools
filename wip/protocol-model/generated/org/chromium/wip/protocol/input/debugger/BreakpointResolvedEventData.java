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

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData>("DebuggerbreakpointResolved", org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerBreakpointResolvedEventData(reader);
    }
  };
}