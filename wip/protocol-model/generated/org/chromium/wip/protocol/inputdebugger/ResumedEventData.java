// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Fired when the virtual machine resumed execution.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ResumedEventData {
  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdebugger.ResumedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdebugger.ResumedEventData>("Debuggerresumed", org.chromium.wip.protocol.inputdebugger.ResumedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.ResumedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDebuggerResumedEventData(obj);
    }
  };
}
