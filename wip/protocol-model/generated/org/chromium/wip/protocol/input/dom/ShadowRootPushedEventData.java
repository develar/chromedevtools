// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Called when shadow root is pushed into the element.
 */
@org.chromium.protocolReader.JsonType
public interface ShadowRootPushedEventData {
  /**
   * Host element id.
   */
  int hostId();
  /**
   * Shadow root.
   */
  org.chromium.wip.protocol.input.dom.NodeValue root();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData>("DOMshadowRootPushed", org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMShadowRootPushedEventData(reader);
    }
  };
}