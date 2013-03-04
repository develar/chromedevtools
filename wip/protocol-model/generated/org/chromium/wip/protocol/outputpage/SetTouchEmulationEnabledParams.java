// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Toggles mouse event-based touch event emulation.
 */
public class SetTouchEmulationEnabledParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param enabled Whether the touch event emulation should be enabled.
   */
  public SetTouchEmulationEnabledParams(boolean enabled) {
    this.put("enabled", enabled);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".setTouchEmulationEnabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
