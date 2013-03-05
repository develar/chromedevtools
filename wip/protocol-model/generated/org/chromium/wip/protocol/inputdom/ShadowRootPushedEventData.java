// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Called when shadow root is pushed into the element.
 */
@org.chromium.protocolParser.JsonType
public interface ShadowRootPushedEventData {
  /**
   Host element id.
   */
  long hostId();

  /**
   Shadow root.
   */
  org.chromium.wip.protocol.inputdom.NodeValue root();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData>("DOMshadowRootPushed", org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMShadowRootPushedEventData(reader);
    }
  };
}
