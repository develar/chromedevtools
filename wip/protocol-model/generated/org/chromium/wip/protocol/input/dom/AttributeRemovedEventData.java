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

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.AttributeRemovedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.AttributeRemovedEventData>("DOMattributeRemoved", org.chromium.wip.protocol.input.dom.AttributeRemovedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.AttributeRemovedEventData parse(org.chromium.wip.protocol.input.ProtocolReponseReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseDOMAttributeRemovedEventData(reader);
    }
  };
}