// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Mirrors <code>DOMNodeRemoved</code> event.
 */
@org.chromium.protocolParser.JsonType
public interface ChildNodeRemovedEventData {
  /**
   * Parent id.
   */
  int parentNodeId();
  /**
   * Id of the node that has been removed.
   */
  int nodeId();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ChildNodeRemovedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ChildNodeRemovedEventData>("DOMchildNodeRemoved", org.chromium.wip.protocol.input.dom.ChildNodeRemovedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.ChildNodeRemovedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMChildNodeRemovedEventData(reader);
    }
  };
}