// Generated source
package org.jetbrains.wip.protocol.timeline;

/**
 * Tells whether timeline agent supports main thread CPU utilization instrumentation.
 */
public final class CanMonitorMainThread extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.timeline.CanMonitorMainThreadResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Timeline.canMonitorMainThread";
  }

  @Override
  public CanMonitorMainThreadResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readTimelineCanMonitorMainThreadResult(jsonReader);
  }
}