// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Tells if backend supports continuous painting
 */
public final class CanContinuouslyPaint extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.CanContinuouslyPaintData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canContinuouslyPaint";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanContinuouslyPaintData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parsePageCanContinuouslyPaintData(data.getDeferredReader());
  }
}