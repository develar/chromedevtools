// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Tells if backend supports debug borders on layers
 */
public final class CanShowDebugBorders extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.CanShowDebugBordersData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canShowDebugBorders";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanShowDebugBordersData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readPageCanShowDebugBordersData(data.getDeferredReader());
  }
}