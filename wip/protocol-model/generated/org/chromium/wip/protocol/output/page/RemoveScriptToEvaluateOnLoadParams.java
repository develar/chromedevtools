// Generated source
package org.chromium.wip.protocol.output.page;

public final class RemoveScriptToEvaluateOnLoadParams extends org.jetbrains.wip.WipRequest {
  public RemoveScriptToEvaluateOnLoadParams(String identifier) {
    put("identifier", identifier);
  }
  @Override
  public String getMethodName() {
    return "Page.removeScriptToEvaluateOnLoad";
  }
}