// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Requests that backend enables continuous painting
 */
public final class SetContinuousPaintingEnabledParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param enabled True for enabling cointinuous painting
   */
  public SetContinuousPaintingEnabledParams(boolean enabled) {
    put("enabled", enabled);
  }
  @Override
  public String getMethodName() {
    return "Page.setContinuousPaintingEnabled";
  }
}