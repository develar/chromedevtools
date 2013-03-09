// Generated source
package org.chromium.wip.protocol.output.timeline;

/**
 * Tells whether timeline agent supports main thread CPU utilization instrumentation.
 */
public final class CanMonitorMainThread extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.timeline.CanMonitorMainThreadData> {

  @Override
  public String getMethodName() {
    return "Timeline.canMonitorMainThread";
  }

  @Override
  public org.chromium.wip.protocol.input.timeline.CanMonitorMainThreadData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseTimelineCanMonitorMainThreadData(data.getDeferredReader());
  }
}