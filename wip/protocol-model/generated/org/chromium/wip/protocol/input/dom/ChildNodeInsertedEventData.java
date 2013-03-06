// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Mirrors <code>DOMNodeInserted</code> event.
 */
@org.chromium.protocolParser.JsonType
public interface ChildNodeInsertedEventData {
  /**
   * Id of the node that has changed.
   */
  long parentNodeId();
  /**
   * If of the previous siblint.
   */
  long previousNodeId();
  /**
   * Inserted node data.
   */
  org.chromium.wip.protocol.input.dom.NodeValue node();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData>("DOMchildNodeInserted", org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMChildNodeInsertedEventData(reader);
    }
  };
}