// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Fired when <code>Element</code>'s inline style is modified via a CSS property modification.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface InlineStyleInvalidatedEventData {
  /**
   Ids of the nodes for which the inline styles have been invalidated.
   */
  java.util.List<Long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/> nodeIds();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData>("DOMinlineStyleInvalidated", org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMInlineStyleInvalidatedEventData(obj);
    }
  };
}
