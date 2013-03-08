// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Allows overriding user agent with the given string.
 */
public final class SetUserAgentOverrideParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param userAgent User agent to use.
   */
  public SetUserAgentOverrideParams(String userAgent) {
    put("userAgent", userAgent);
  }
  @Override
  public String getMethodName() {
    return "Network.setUserAgentOverride";
  }
}