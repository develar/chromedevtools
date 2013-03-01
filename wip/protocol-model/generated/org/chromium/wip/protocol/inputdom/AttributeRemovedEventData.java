// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Fired when <code>Element</code>'s attribute is removed.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface AttributeRemovedEventData {
  /**
   Id of the node that has changed.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId();

  /**
   A ttribute name.
   */
  String name();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.AttributeRemovedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.AttributeRemovedEventData>("DOMattributeRemoved", org.chromium.wip.protocol.inputdom.AttributeRemovedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.AttributeRemovedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMAttributeRemovedEventData(obj);
    }
  };
}
