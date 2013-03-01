// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputnetwork;

/**
Toggles ignoring cache for each request. If <code>true</code>, cache will not be used.
 */
public class SetCacheDisabledParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param cacheDisabled Cache disabled state.
   */
  public SetCacheDisabledParams(boolean cacheDisabled) {
    this.put("cacheDisabled", cacheDisabled);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".setCacheDisabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
