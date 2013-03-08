// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Requests that backend shows debug borders on layers
 */
public final class SetShowDebugBordersParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param show True for showing debug borders
   */
  public SetShowDebugBordersParams(boolean show) {
    put("show", show);
  }
  @Override
  public String getMethodName() {
    return "Page.setShowDebugBorders";
  }
}