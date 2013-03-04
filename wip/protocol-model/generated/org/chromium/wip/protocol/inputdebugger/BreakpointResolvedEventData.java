// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Fired when breakpoint is resolved to an actual script and location.
 */
@org.chromium.protocolParser.JsonType
public interface BreakpointResolvedEventData {
  /**
   Breakpoint unique identifier.
   */
  String breakpointId();

  /**
   Actual breakpoint location.
   */
  org.chromium.wip.protocol.inputdebugger.LocationValue location();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData>("DebuggerbreakpointResolved", org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseDebuggerBreakpointResolvedEventData(reader);
    }
  };
}
