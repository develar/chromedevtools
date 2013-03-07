// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Requests that backend shows the FPS counter
 */
public class SetShowFPSCounterParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param show True for showing the FPS counter
   */
  public SetShowFPSCounterParams(boolean show) {
    put("show", show);
  }
  @Override
  public String getMethodName() {
    return "Page.setShowFPSCounter";
  }
}