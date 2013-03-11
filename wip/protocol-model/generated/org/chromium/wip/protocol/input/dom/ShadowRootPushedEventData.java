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

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData>("DOMshadowRootPushed", org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMShadowRootPushedEventData(reader);
    }
  };
}