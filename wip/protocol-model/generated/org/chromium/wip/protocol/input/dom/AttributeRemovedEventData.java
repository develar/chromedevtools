// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.dom;

/**
 Fired when <code>Element</code>'s attribute is removed.
 */
@org.chromium.protocolParser.JsonType
public interface AttributeRemovedEventData {
  /**
   Id of the node that has changed.
   */
  long nodeId();

  /**
   A ttribute name.
   */
  String name();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.AttributeRemovedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.AttributeRemovedEventData>("DOMattributeRemoved", org.chromium.wip.protocol.input.dom.AttributeRemovedEventData.class) {
    @Override public org.chromium.wip.protocol.input.dom.AttributeRemovedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMAttributeRemovedEventData(reader);
    }
  };
}
