// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Mirrors <code>DOMNodeRemoved</code> event.
 */
@org.chromium.protocolParser.JsonType
public interface ChildNodeRemovedEventData {
  /**
   Parent id.
   */
  long parentNodeId();

  /**
   Id of the node that has been removed.
   */
  long nodeId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData>("DOMchildNodeRemoved", org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMChildNodeRemovedEventData(reader);
    }
  };
}
