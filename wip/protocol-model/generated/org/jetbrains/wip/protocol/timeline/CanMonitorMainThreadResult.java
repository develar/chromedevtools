// Generated source
package org.jetbrains.wip.protocol.timeline;

/**
 * Tells whether timeline agent supports main thread CPU utilization instrumentation.
 */
@org.chromium.protocolReader.JsonType
public interface CanMonitorMainThreadResult {
  /**
   * True if timeline supports main thread CPU utilization instrumentation.
   */
  boolean result();

}