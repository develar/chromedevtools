// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

@org.chromium.sdk.internal.protocolparser.JsonType
public interface LoadEventFiredEventData {
  Number timestamp();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.LoadEventFiredEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.LoadEventFiredEventData>("PageloadEventFired", org.chromium.wip.protocol.inputpage.LoadEventFiredEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.LoadEventFiredEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageLoadEventFiredEventData(obj);
    }
  };
}
