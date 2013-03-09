// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Allows overriding user agent with the given string.
 */
public final class SetUserAgentOverride extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param userAgent User agent to use.
   */
  public SetUserAgentOverride(String userAgent) {
    writeString("userAgent", userAgent);
  }
  @Override
  public String getMethodName() {
    return "Network.setUserAgentOverride";
  }
}