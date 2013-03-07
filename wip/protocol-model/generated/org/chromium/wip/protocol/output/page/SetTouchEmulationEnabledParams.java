// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Toggles mouse event-based touch event emulation.
 */
public class SetTouchEmulationEnabledParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param enabled Whether the touch event emulation should be enabled.
   */
  public SetTouchEmulationEnabledParams(boolean enabled) {
    put("enabled", enabled);
  }
  @Override
  public String getMethodName() {
    return "Page.setTouchEmulationEnabled";
  }
}