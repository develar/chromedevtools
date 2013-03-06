// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Controls the visibility of compositing borders.
 */
public class SetCompositingBordersVisibleParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param visible True for showing compositing borders.
   */
  public SetCompositingBordersVisibleParams(boolean visible) {
    put("visible", visible);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setCompositingBordersVisible";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}