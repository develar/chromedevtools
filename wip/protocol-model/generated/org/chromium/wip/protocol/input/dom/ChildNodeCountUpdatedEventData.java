// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Fired when <code>Container</code>'s child node count has changed.
 */
@org.chromium.protocolParser.JsonType
public interface ChildNodeCountUpdatedEventData {
  /**
   * Id of the node that has changed.
   */
  long nodeId();
  /**
   * New node count.
   */
  long childNodeCount();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ChildNodeCountUpdatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ChildNodeCountUpdatedEventData>("DOMchildNodeCountUpdated", org.chromium.wip.protocol.input.dom.ChildNodeCountUpdatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.ChildNodeCountUpdatedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMChildNodeCountUpdatedEventData(reader);
    }
  };
}