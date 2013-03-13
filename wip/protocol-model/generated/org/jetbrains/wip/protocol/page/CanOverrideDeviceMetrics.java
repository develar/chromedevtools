// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Checks whether <code>setDeviceMetricsOverride</code> can be invoked.
 */
public final class CanOverrideDeviceMetrics extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.page.CanOverrideDeviceMetricsResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canOverrideDeviceMetrics";
  }

  @Override
  public CanOverrideDeviceMetricsResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCanOverrideDeviceMetricsResult(jsonReader);
  }
}