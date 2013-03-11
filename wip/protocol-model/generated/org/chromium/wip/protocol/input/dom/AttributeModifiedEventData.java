// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Fired when <code>Element</code>'s attribute is modified.
 */
@org.chromium.protocolReader.JsonType
public interface AttributeModifiedEventData {
  /**
   * Id of the node that has changed.
   */
  int nodeId();
  /**
   * Attribute name.
   */
  String name();
  /**
   * Attribute value.
   */
  String value();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.AttributeModifiedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.AttributeModifiedEventData>("DOMattributeModified", org.chromium.wip.protocol.input.dom.AttributeModifiedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.AttributeModifiedEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMAttributeModifiedEventData(reader);
    }
  };
}