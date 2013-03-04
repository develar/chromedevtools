// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

public class RemoveScriptToEvaluateOnLoadParams extends org.jetbrains.wip.protocol.WipParams {
  public RemoveScriptToEvaluateOnLoadParams(String/*See org.chromium.wip.protocol.commonpage.ScriptIdentifierTypedef*/ identifier) {
    this.put("identifier", identifier);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".removeScriptToEvaluateOnLoad";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
