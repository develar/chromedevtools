// Generated source
package org.chromium.wip.protocol.output.timeline;

/**
 * Tells whether timeline agent supports main thread CPU utilization instrumentation.
 */
public final class CanMonitorMainThread extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.timeline.CanMonitorMainThreadData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Timeline.canMonitorMainThread";
  }

  @Override
  public org.chromium.wip.protocol.input.timeline.CanMonitorMainThreadData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseTimelineCanMonitorMainThreadData(data.getDeferredReader());
  }
}