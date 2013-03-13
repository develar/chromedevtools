// Generated source
package org.jetbrains.wip.protocol.debugger;

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
  org.jetbrains.wip.protocol.debugger.LocationValue location();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.debugger.BreakpointResolvedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.debugger.BreakpointResolvedEventData>("DebuggerbreakpointResolved", org.jetbrains.wip.protocol.debugger.BreakpointResolvedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.debugger.BreakpointResolvedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerBreakpointResolvedEventData(reader);
    }
  };
}