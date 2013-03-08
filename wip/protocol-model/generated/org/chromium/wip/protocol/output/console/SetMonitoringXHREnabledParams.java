// Generated source
package org.chromium.wip.protocol.output.console;

/**
 * Toggles monitoring of XMLHttpRequest. If <code>true</code>, console will receive messages upon each XHR issued.
 */
public final class SetMonitoringXHREnabledParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param enabled Monitoring enabled state.
   */
  public SetMonitoringXHREnabledParams(boolean enabled) {
    put("enabled", enabled);
  }
  @Override
  public String getMethodName() {
    return "Console.setMonitoringXHREnabled";
  }
}