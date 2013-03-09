// Generated source
package org.chromium.wip.protocol.output.timeline;

/**
 * Controls if DOM counters should be send as part of timeline events.
 */
public final class SetIncludeDomCounters extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param enabled Whether DOM counters data should be included into timeline events.
   */
  public SetIncludeDomCounters(boolean enabled) {
    writeBoolean("enabled", enabled);
  }
  @Override
  public String getMethodName() {
    return "Timeline.setIncludeDomCounters";
  }
}