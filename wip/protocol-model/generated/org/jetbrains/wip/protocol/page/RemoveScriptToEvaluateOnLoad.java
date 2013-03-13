// Generated source
package org.jetbrains.wip.protocol.page;

public final class RemoveScriptToEvaluateOnLoad extends org.jetbrains.wip.protocol.WipRequest {
  public RemoveScriptToEvaluateOnLoad(String identifier) {
    writeString("identifier", identifier);
  }
  @Override
  public String getMethodName() {
    return "Page.removeScriptToEvaluateOnLoad";
  }
}