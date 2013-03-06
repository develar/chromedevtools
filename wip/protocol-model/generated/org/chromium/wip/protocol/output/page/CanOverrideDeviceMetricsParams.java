// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Checks whether <code>setDeviceMetricsOverride</code> can be invoked.
 */
public class CanOverrideDeviceMetricsParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.CanOverrideDeviceMetricsData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".canOverrideDeviceMetrics";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideDeviceMetricsData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanOverrideDeviceMetricsData(data.getUnderlyingObject());
  }
}