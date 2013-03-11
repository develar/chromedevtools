// Generated source
package org.chromium.wip.protocol.input.dom;

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

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ShadowRootPoppedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ShadowRootPoppedEventData>("DOMshadowRootPopped", org.chromium.wip.protocol.input.dom.ShadowRootPoppedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.ShadowRootPoppedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMShadowRootPoppedEventData(reader);
    }
  };
}