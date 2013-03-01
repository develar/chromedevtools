// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Check the backend if Web Inspector can override the device orientation.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CanOverrideDeviceOrientationData {
  /**
   If true, <code>setDeviceOrientationOverride</code> can safely be invoked on the agent.
   */
  boolean result();

}
