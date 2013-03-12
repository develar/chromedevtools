// Generated source
package org.chromium.wip.protocol.debugger;

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
  org.chromium.wip.protocol.debugger.LocationValue location();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.debugger.BreakpointResolvedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.debugger.BreakpointResolvedEventData>("DebuggerbreakpointResolved", org.chromium.wip.protocol.debugger.BreakpointResolvedEventData.class) {
    @Override
    public org.chromium.wip.protocol.debugger.BreakpointResolvedEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDebuggerBreakpointResolvedEventData(reader);
    }
  };
}