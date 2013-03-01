// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Returns detailed informtation on given function.
 */
public class GetFunctionDetailsParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.GetFunctionDetailsData> {
  /**
   @param functionId Id of the function to get location for.
   */
  public GetFunctionDetailsParams(String/*See org.chromium.wip.protocol.commonruntime.RemoteObjectIdTypedef*/ functionId) {
    this.put("functionId", functionId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".getFunctionDetails";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.GetFunctionDetailsData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDebuggerGetFunctionDetailsData(data.getUnderlyingObject());
  }

}
