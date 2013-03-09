// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Requests that backend enables continuous painting
 */
public final class SetContinuousPaintingEnabled extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param enabled True for enabling cointinuous painting
   */
  public SetContinuousPaintingEnabled(boolean enabled) {
    writeBoolean("enabled", enabled);
  }
  @Override
  public String getMethodName() {
    return "Page.setContinuousPaintingEnabled";
  }
}