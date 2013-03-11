// Generated source
package org.chromium.wip.protocol.output.timeline;

/**
 * Tells whether timeline agent supports frame instrumentation.
 */
public final class SupportsFrameInstrumentation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.timeline.SupportsFrameInstrumentationData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Timeline.supportsFrameInstrumentation";
  }

  @Override
  public org.chromium.wip.protocol.input.timeline.SupportsFrameInstrumentationData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseTimelineSupportsFrameInstrumentationData(data.getDeferredReader());
  }
}