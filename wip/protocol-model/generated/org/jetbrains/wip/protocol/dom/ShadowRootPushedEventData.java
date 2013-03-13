// Generated source
package org.jetbrains.wip.protocol.dom;

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
  org.jetbrains.wip.protocol.dom.NodeValue root();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.ShadowRootPushedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.ShadowRootPushedEventData>("DOMshadowRootPushed", org.jetbrains.wip.protocol.dom.ShadowRootPushedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.dom.ShadowRootPushedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMShadowRootPushedEventData(reader);
    }
  };
}