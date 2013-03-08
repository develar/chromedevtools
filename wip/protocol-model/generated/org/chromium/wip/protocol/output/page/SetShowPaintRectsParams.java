// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Requests that backend shows paint rectangles
 */
public final class SetShowPaintRectsParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param result True for showing paint rectangles
   */
  public SetShowPaintRectsParams(boolean result) {
    put("result", result);
  }
  @Override
  public String getMethodName() {
    return "Page.setShowPaintRects";
  }
}