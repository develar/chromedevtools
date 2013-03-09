// Generated source
package org.chromium.wip.protocol.output.timeline;

/**
 * Tells whether timeline agent supports frame instrumentation.
 */
public final class SupportsFrameInstrumentation extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.timeline.SupportsFrameInstrumentationData> {

  @Override
  public String getMethodName() {
    return "Timeline.supportsFrameInstrumentation";
  }

  @Override
  public org.chromium.wip.protocol.input.timeline.SupportsFrameInstrumentationData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseTimelineSupportsFrameInstrumentationData(data.getDeferredReader());
  }
}