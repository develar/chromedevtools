// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Tells if backend supports continuous painting
 */
public final class CanContinuouslyPaint extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.page.CanContinuouslyPaintData> {

  @Override
  public String getMethodName() {
    return "Page.canContinuouslyPaint";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanContinuouslyPaintData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanContinuouslyPaintData(data.getDeferredReader());
  }
}