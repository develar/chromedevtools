// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Overrides the Device Orientation.
 */
public class SetDeviceOrientationOverrideParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param alpha Mock alpha
   * @param beta Mock beta
   * @param gamma Mock gamma
   */
  public SetDeviceOrientationOverrideParams(double alpha, double beta, double gamma) {
    put("alpha", alpha);
    put("beta", beta);
    put("gamma", gamma);
  }
  @Override
  public String getMethodName() {
    return "Page.setDeviceOrientationOverride";
  }
}