// Generated source
package org.chromium.wip.protocol.output.page;

public final class RemoveScriptToEvaluateOnLoad extends org.jetbrains.wip.protocol.WipRequest {
  public RemoveScriptToEvaluateOnLoad(String identifier) {
    writeString("identifier", identifier);
  }
  @Override
  public String getMethodName() {
    return "Page.removeScriptToEvaluateOnLoad";
  }
}