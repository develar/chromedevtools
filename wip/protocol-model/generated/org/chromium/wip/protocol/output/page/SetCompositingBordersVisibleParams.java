// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Controls the visibility of compositing borders.
 */
public class SetCompositingBordersVisibleParams extends org.jetbrains.wip.protocol.WipRequest {
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