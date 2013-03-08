// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Controls the visibility of compositing borders.
 */
public final class SetCompositingBordersVisibleParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param visible True for showing compositing borders.
   */
  public SetCompositingBordersVisibleParams(boolean visible) {
    put("visible", visible);
  }
  @Override
  public String getMethodName() {
    return "Page.setCompositingBordersVisible";
  }
}