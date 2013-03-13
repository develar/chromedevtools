// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Called when shadow root is popped from the element.
 */
@org.chromium.protocolReader.JsonType
public interface ShadowRootPoppedEventData {
  /**
   * Host element id.
   */
  int hostId();
  /**
   * Shadow root id.
   */
  int rootId();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.ShadowRootPoppedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.ShadowRootPoppedEventData>("DOMshadowRootPopped", org.jetbrains.wip.protocol.dom.ShadowRootPoppedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.dom.ShadowRootPoppedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMShadowRootPoppedEventData(reader);
    }
  };
}