// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Fired when <code>Element</code>'s attribute is removed.
 */
@org.chromium.protocolReader.JsonType
public interface AttributeRemovedEventData {
  /**
   * Id of the node that has changed.
   */
  int nodeId();
  /**
   * A ttribute name.
   */
  String name();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.AttributeRemovedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.AttributeRemovedEventData>("DOMattributeRemoved", org.chromium.wip.protocol.input.dom.AttributeRemovedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.AttributeRemovedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMAttributeRemovedEventData(reader);
    }
  };
}