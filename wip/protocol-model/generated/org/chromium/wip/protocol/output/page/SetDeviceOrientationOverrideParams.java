// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
Overrides the Device Orientation.
 */
public class SetDeviceOrientationOverrideParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param alpha Mock alpha
   @param beta Mock beta
   @param gamma Mock gamma
   */
  public SetDeviceOrientationOverrideParams(Number alpha, Number beta, Number gamma) {
    //this.put("alpha", alpha);
    //this.put("beta", beta);
    //this.put("gamma", gamma);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setDeviceOrientationOverride";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
