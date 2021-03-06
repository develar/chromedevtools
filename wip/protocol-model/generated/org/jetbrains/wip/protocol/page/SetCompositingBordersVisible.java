// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Controls the visibility of compositing borders.
 */
public final class SetCompositingBordersVisible extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param visible True for showing compositing borders.
   */
  public SetCompositingBordersVisible(boolean visible) {
    writeBoolean("visible", visible);
  }
  @Override
  public String getMethodName() {
    return "Page.setCompositingBordersVisible";
  }
}