// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Toggles ignoring cache for each request. If <code>true</code>, cache will not be used.
 */
public final class SetCacheDisabled extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param cacheDisabled Cache disabled state.
   */
  public SetCacheDisabled(boolean cacheDisabled) {
    writeBoolean("cacheDisabled", cacheDisabled);
  }
  @Override
  public String getMethodName() {
    return "Network.setCacheDisabled";
  }
}