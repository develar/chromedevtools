// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Edits JavaScript source live.
 */
public class SetScriptSourceParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.SetScriptSourceData> {
  /**
   @param scriptId Id of the script to edit.
   @param scriptSource New content of the script.
   @param previewOpt  If true the change will not actually be applied. Preview mode may be used to get result description without actually modifying the code.
   */
  public SetScriptSourceParams(String/*See org.chromium.wip.protocol.commondebugger.ScriptIdTypedef*/ scriptId, String scriptSource, Boolean previewOpt) {
    this.put("scriptId", scriptId);
    this.put("scriptSource", scriptSource);
    if (previewOpt != null) {
      this.put("preview", previewOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setScriptSource";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.SetScriptSourceData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDebuggerSetScriptSourceData(data.getUnderlyingObject());
  }

}
