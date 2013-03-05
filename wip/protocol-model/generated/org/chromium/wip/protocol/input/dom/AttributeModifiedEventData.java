// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.dom;

/**
 Fired when <code>Element</code>'s attribute is modified.
 */
@org.chromium.protocolParser.JsonType
public interface AttributeModifiedEventData {
  /**
   Id of the node that has changed.
   */
  long nodeId();

  /**
   Attribute name.
   */
  String name();

  /**
   Attribute value.
   */
  String value();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.AttributeModifiedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.AttributeModifiedEventData>("DOMattributeModified", org.chromium.wip.protocol.input.dom.AttributeModifiedEventData.class) {
    @Override public org.chromium.wip.protocol.input.dom.AttributeModifiedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMAttributeModifiedEventData(reader);
    }
  };
}
