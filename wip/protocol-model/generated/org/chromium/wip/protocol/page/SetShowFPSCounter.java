// Generated source
package org.chromium.wip.protocol.page;

/**
 * Requests that backend shows the FPS counter
 */
public final class SetShowFPSCounter extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param show True for showing the FPS counter
   */
  public SetShowFPSCounter(boolean show) {
    writeBoolean("show", show);
  }
  @Override
  public String getMethodName() {
    return "Page.setShowFPSCounter";
  }
}