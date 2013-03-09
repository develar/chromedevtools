// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Requests that backend shows debug borders on layers
 */
public final class SetShowDebugBorders extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param show True for showing debug borders
   */
  public SetShowDebugBorders(boolean show) {
    writeBoolean("show", show);
  }
  @Override
  public String getMethodName() {
    return "Page.setShowDebugBorders";
  }
}