// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Toggles ignoring cache for each request. If <code>true</code>, cache will not be used.
 */
public class SetCacheDisabledParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param cacheDisabled Cache disabled state.
   */
  public SetCacheDisabledParams(boolean cacheDisabled) {
    put("cacheDisabled", cacheDisabled);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.NETWORK + ".setCacheDisabled";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}