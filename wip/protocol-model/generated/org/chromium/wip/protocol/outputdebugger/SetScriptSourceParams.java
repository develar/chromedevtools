// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Edits JavaScript source live.
 */
public class SetScriptSourceParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.SetScriptSourceData> {
  /**
   @param scriptId Id of the script to edit.
   @param scriptSource New content of the script.
   @param previewOpt  If true the change will not actually be applied. Preview mode may be used to get result description without actually modifying the code.
   */
  public SetScriptSourceParams(String scriptId, String scriptSource, boolean previewOpt) {
    //this.put("scriptId", scriptId);
    //this.put("scriptSource", scriptSource);
    //this.put("preview", previewOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setScriptSource";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.SetScriptSourceData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.WipGeneratedParserRoot parser) {
    return parser.parseDebuggerSetScriptSourceData(data.getUnderlyingObject());
  }

}
