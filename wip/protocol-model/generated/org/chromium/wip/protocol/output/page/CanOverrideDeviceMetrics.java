// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Checks whether <code>setDeviceMetricsOverride</code> can be invoked.
 */
public final class CanOverrideDeviceMetrics extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.CanOverrideDeviceMetricsData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideDeviceMetrics";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideDeviceMetricsData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readPageCanOverrideDeviceMetricsData(data.getDeferredReader());
  }
}