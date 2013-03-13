// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Overrides the values of device screen dimensions (window.screen.width, window.screen.height, window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media query results) and the font scale factor.
 */
public final class SetDeviceMetricsOverride extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param width Overriding width value in pixels (minimum 0, maximum 10000000). 0 disables the override.
   * @param height Overriding height value in pixels (minimum 0, maximum 10000000). 0 disables the override.
   * @param fontScaleFactor Overriding font scale factor value (must be positive). 1 disables the override.
   * @param fitWindow Whether a view that exceeds the available browser window area should be scaled down to fit.
   */
  public SetDeviceMetricsOverride(int width, int height, double fontScaleFactor, boolean fitWindow) {
    writeInt("width", width);
    writeInt("height", height);
    writeDouble("fontScaleFactor", fontScaleFactor);
    writeBoolean("fitWindow", fitWindow);
  }
  @Override
  public String getMethodName() {
    return "Page.setDeviceMetricsOverride";
  }
}