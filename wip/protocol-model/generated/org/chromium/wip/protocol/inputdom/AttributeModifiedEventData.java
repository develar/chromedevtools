// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Fired when <code>Element</code>'s attribute is modified.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface AttributeModifiedEventData {
  /**
   Id of the node that has changed.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId();

  /**
   Attribute name.
   */
  String name();

  /**
   Attribute value.
   */
  String value();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.AttributeModifiedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.AttributeModifiedEventData>("DOMattributeModified", org.chromium.wip.protocol.inputdom.AttributeModifiedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.AttributeModifiedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMAttributeModifiedEventData(obj);
    }
  };
}
