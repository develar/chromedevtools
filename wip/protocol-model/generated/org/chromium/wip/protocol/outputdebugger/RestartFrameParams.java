// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Restarts particular call frame from the beginning.
 */
public class RestartFrameParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.RestartFrameData> {
  /**
   @param callFrameId Call frame identifier to evaluate on.
   */
  public RestartFrameParams(String/*See org.chromium.wip.protocol.commondebugger.CallFrameIdTypedef*/ callFrameId) {
    this.put("callFrameId", callFrameId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".restartFrame";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.RestartFrameData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDebuggerRestartFrameData(data.getUnderlyingObject());
  }

}
