// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Check the backend if Web Inspector can override the device orientation.
 */
@org.chromium.protocolReader.JsonType
public interface CanOverrideDeviceOrientationResult {
  /**
   * If true, <code>setDeviceOrientationOverride</code> can safely be invoked on the agent.
   */
  boolean result();

}