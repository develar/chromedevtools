// Generated source
package org.chromium.wip.protocol.timeline;

/**
 * Controls whether statistics on native memory usage is sent with timeline events.
 */
public final class SetIncludeNativeMemoryStatistics extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param enabled Whether native memory usage statistics should be reported as part of timeline events.
   */
  public SetIncludeNativeMemoryStatistics(boolean enabled) {
    writeBoolean("enabled", enabled);
  }
  @Override
  public String getMethodName() {
    return "Timeline.setIncludeNativeMemoryStatistics";
  }
}