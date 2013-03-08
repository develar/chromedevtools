// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Check the backend if Web Inspector can override the device orientation.
 */
@org.chromium.protocolReader.JsonType
public interface CanOverrideDeviceOrientationData {
  /**
   * If true, <code>setDeviceOrientationOverride</code> can safely be invoked on the agent.
   */
  boolean result();

}