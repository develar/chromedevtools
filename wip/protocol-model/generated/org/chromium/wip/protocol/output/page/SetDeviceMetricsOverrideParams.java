// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
Overrides the values of device screen dimensions (window.screen.width, window.screen.height, window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media query results) and the font scale factor.
 */
public class SetDeviceMetricsOverrideParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param width Overriding width value in pixels (minimum 0, maximum 10000000). 0 disables the override.
   * @param height Overriding height value in pixels (minimum 0, maximum 10000000). 0 disables the override.
   * @param fontScaleFactor Overriding font scale factor value (must be positive). 1 disables the override.
   * @param fitWindow Whether a view that exceeds the available browser window area should be scaled down to fit.
   */
  public SetDeviceMetricsOverrideParams(long width, long height, Number fontScaleFactor, boolean fitWindow) {
    put("width", width);
    put("height", height);
    put("fontScaleFactor", fontScaleFactor);
    put("fitWindow", fitWindow);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setDeviceMetricsOverride";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}