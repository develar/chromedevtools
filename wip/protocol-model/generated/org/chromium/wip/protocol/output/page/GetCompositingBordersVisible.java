// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Indicates the visibility of compositing borders.
 */
public final class GetCompositingBordersVisible extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.GetCompositingBordersVisibleData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.getCompositingBordersVisible";
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetCompositingBordersVisibleData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readPageGetCompositingBordersVisibleData(data.getDeferredReader());
  }
}