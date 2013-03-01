// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Fired when breakpoint is resolved to an actual script and location.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface BreakpointResolvedEventData {
  /**
   Breakpoint unique identifier.
   */
  String/*See org.chromium.wip.protocol.commondebugger.BreakpointIdTypedef*/ breakpointId();

  /**
   Actual breakpoint location.
   */
  org.chromium.wip.protocol.inputdebugger.LocationValue location();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData>("DebuggerbreakpointResolved", org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDebuggerBreakpointResolvedEventData(obj);
    }
  };
}
