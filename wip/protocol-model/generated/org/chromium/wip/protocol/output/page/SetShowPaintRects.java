// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Requests that backend shows paint rectangles
 */
public final class SetShowPaintRects extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param result True for showing paint rectangles
   */
  public SetShowPaintRects(boolean result) {
    put("result", result);
  }
  @Override
  public String getMethodName() {
    return "Page.setShowPaintRects";
  }
}