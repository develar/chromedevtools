// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputnetwork;

/**
Allows overriding user agent with the given string.
 */
public class SetUserAgentOverrideParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param userAgent User agent to use.
   */
  public SetUserAgentOverrideParams(String userAgent) {
    this.put("userAgent", userAgent);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".setUserAgentOverride";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
