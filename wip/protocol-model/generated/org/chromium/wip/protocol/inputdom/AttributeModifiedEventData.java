// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

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

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.AttributeModifiedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.AttributeModifiedEventData>("DOMattributeModified", org.chromium.wip.protocol.inputdom.AttributeModifiedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.AttributeModifiedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseDOMAttributeModifiedEventData(reader);
    }
  };
}
