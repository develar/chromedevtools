// Generated source
package org.jetbrains.wip.protocol.dom;

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

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.AttributeRemovedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.AttributeRemovedEventData>("DOMattributeRemoved", org.jetbrains.wip.protocol.dom.AttributeRemovedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.dom.AttributeRemovedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMAttributeRemovedEventData(reader);
    }
  };
}