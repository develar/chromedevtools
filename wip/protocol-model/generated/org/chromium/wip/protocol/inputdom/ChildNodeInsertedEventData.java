// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Mirrors <code>DOMNodeInserted</code> event.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ChildNodeInsertedEventData {
  /**
   Id of the node that has changed.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ parentNodeId();

  /**
   If of the previous siblint.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ previousNodeId();

  /**
   Inserted node data.
   */
  org.chromium.wip.protocol.inputdom.NodeValue node();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData>("DOMchildNodeInserted", org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMChildNodeInsertedEventData(obj);
    }
  };
}
