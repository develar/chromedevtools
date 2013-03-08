// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Checks whether <code>setDeviceMetricsOverride</code> can be invoked.
 */
public final class CanOverrideDeviceMetricsParams extends org.jetbrains.wip.WipRequestWithResponse<org.chromium.wip.protocol.input.page.CanOverrideDeviceMetricsData> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideDeviceMetrics";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideDeviceMetricsData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanOverrideDeviceMetricsData(data.getDeferredReader());
  }
}