// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Called when shadow root is pushed into the element.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ShadowRootPushedEventData {
  /**
   Host element id.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ hostId();

  /**
   Shadow root.
   */
  org.chromium.wip.protocol.inputdom.NodeValue root();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData>("DOMshadowRootPushed", org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMShadowRootPushedEventData(obj);
    }
  };
}
