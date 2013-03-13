// Generated source
package org.jetbrains.wip.protocol.timeline;

/**
 * Tells whether timeline agent supports frame instrumentation.
 */
public final class SupportsFrameInstrumentation extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.timeline.SupportsFrameInstrumentationResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Timeline.supportsFrameInstrumentation";
  }

  @Override
  public SupportsFrameInstrumentationResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readTimelineSupportsFrameInstrumentationResult(jsonReader);
  }
}