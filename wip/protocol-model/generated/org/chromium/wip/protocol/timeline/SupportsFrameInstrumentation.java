// Generated source
package org.chromium.wip.protocol.timeline;

/**
 * Tells whether timeline agent supports frame instrumentation.
 */
public final class SupportsFrameInstrumentation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.timeline.SupportsFrameInstrumentationResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Timeline.supportsFrameInstrumentation";
  }

  @Override
  public SupportsFrameInstrumentationResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readTimelineSupportsFrameInstrumentationResult(jsonReader);
  }
}