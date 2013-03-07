// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Toggles ignoring cache for each request. If <code>true</code>, cache will not be used.
 */
public class SetCacheDisabledParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param cacheDisabled Cache disabled state.
   */
  public SetCacheDisabledParams(boolean cacheDisabled) {
    put("cacheDisabled", cacheDisabled);
  }
  @Override
  public String getMethodName() {
    return "Network.setCacheDisabled";
  }
}