// Generated source
package org.chromium.wip.protocol.timeline;

/**
 * Tells whether timeline agent supports main thread CPU utilization instrumentation.
 */
public final class CanMonitorMainThread extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.timeline.CanMonitorMainThreadResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Timeline.canMonitorMainThread";
  }

  @Override
  public CanMonitorMainThreadResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readTimelineCanMonitorMainThreadResult(jsonReader);
  }
}