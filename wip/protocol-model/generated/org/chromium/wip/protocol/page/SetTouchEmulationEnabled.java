// Generated source
package org.chromium.wip.protocol.page;

/**
 * Toggles mouse event-based touch event emulation.
 */
public final class SetTouchEmulationEnabled extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param enabled Whether the touch event emulation should be enabled.
   */
  public SetTouchEmulationEnabled(boolean enabled) {
    writeBoolean("enabled", enabled);
  }
  @Override
  public String getMethodName() {
    return "Page.setTouchEmulationEnabled";
  }
}