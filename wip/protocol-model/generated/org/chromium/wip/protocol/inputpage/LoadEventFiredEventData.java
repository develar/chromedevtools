// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

@org.chromium.protocolParser.JsonType
public interface LoadEventFiredEventData {
  Number timestamp();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.LoadEventFiredEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.LoadEventFiredEventData>("PageloadEventFired", org.chromium.wip.protocol.inputpage.LoadEventFiredEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.LoadEventFiredEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parsePageLoadEventFiredEventData(reader);
    }
  };
}
