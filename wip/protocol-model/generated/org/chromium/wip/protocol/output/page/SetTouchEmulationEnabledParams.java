// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
Toggles mouse event-based touch event emulation.
 */
public class SetTouchEmulationEnabledParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param enabled Whether the touch event emulation should be enabled.
   */
  public SetTouchEmulationEnabledParams(boolean enabled) {
    put("enabled", enabled);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setTouchEmulationEnabled";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}