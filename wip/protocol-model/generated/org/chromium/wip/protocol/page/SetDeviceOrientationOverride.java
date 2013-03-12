// Generated source
package org.chromium.wip.protocol.page;

/**
 * Overrides the Device Orientation.
 */
public final class SetDeviceOrientationOverride extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param alpha Mock alpha
   * @param beta Mock beta
   * @param gamma Mock gamma
   */
  public SetDeviceOrientationOverride(double alpha, double beta, double gamma) {
    writeDouble("alpha", alpha);
    writeDouble("beta", beta);
    writeDouble("gamma", gamma);
  }
  @Override
  public String getMethodName() {
    return "Page.setDeviceOrientationOverride";
  }
}