// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

public class RemoveScriptToEvaluateOnLoadParams extends org.jetbrains.wip.protocol.WipParams {
  public RemoveScriptToEvaluateOnLoadParams(String identifier) {
    put("identifier", identifier);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".removeScriptToEvaluateOnLoad";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}