// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputconsole;

/**
Toggles monitoring of XMLHttpRequest. If <code>true</code>, console will receive messages upon each XHR issued.
 */
public class SetMonitoringXHREnabledParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param enabled Monitoring enabled state.
   */
  public SetMonitoringXHREnabledParams(boolean enabled) {
    this.put("enabled", enabled);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.CONSOLE + ".setMonitoringXHREnabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
