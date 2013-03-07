// Generated source
package org.chromium.wip.protocol.output.page;

public class RemoveScriptToEvaluateOnLoadParams extends org.jetbrains.wip.protocol.WipRequest {
  public RemoveScriptToEvaluateOnLoadParams(String identifier) {
    put("identifier", identifier);
  }
  @Override
  public String getMethodName() {
    return "Page.removeScriptToEvaluateOnLoad";
  }
}