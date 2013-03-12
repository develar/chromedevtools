// Generated source
package org.chromium.wip.protocol.page;

/**
 * Checks whether <code>setDeviceMetricsOverride</code> can be invoked.
 */
public final class CanOverrideDeviceMetrics extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.CanOverrideDeviceMetricsResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideDeviceMetrics";
  }

  @Override
  public CanOverrideDeviceMetricsResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCanOverrideDeviceMetricsResult(jsonReader);
  }
}