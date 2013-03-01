// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Mirrors <code>DOMNodeRemoved</code> event.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface ChildNodeRemovedEventData {
  /**
   Parent id.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ parentNodeId();

  /**
   Id of the node that has been removed.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData>("DOMchildNodeRemoved", org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMChildNodeRemovedEventData(obj);
    }
  };
}
