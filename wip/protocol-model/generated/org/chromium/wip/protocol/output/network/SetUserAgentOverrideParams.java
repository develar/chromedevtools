// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.network;

/**
Allows overriding user agent with the given string.
 */
public class SetUserAgentOverrideParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param userAgent User agent to use.
   */
  public SetUserAgentOverrideParams(String userAgent) {
    put("userAgent", userAgent);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.NETWORK + ".setUserAgentOverride";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}