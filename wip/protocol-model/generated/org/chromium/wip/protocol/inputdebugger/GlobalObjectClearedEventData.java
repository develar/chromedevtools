// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Called when global has been cleared and debugger client should reset its state. Happens upon navigation or reload.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GlobalObjectClearedEventData {
  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData>("DebuggerglobalObjectCleared", org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDebuggerGlobalObjectClearedEventData(obj);
    }
  };
}
